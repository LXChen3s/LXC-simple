package tk.mybatis.simple.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import tk.mybatis.simple.model.SysRole;

public interface RoleMapper {
	@Select({"select id,roel_name roleName,enabled enable,creat_by createBy,creat_time createTime ",
		     "from sys_role ",
		     "where id=#{id}"})
	SysRole selectById(Long id);
	
	/*
	 * mybatis 3.3.1开始加入id属性
	 */
	@Results(id="sysRoleMap",value= {
			@Result(property="id",column="id",id=true),
			@Result(property="roleName",column="roel_name"),
			@Result(property="enable",column="enabled"),
			@Result(property="createBy",column="creat_by"),
			@Result(property="createTime",column="creat_time"),
	})
	@Select("")
	SysRole selectById3(Long id);
	
	/*
	 * 通过id进行调用
	 */
	@ResultMap("sysRoleMap")
	@Select("select * from sys_role where id=#{id}")
	SysRole selectById2(Long id);
	
	/*
	 * insert返回自增主键
	 */
	@Insert({"insert into sys_role(roel_name,enabled,creat_by,creat_time) ",
		     "values(#{roleName},#{enable},#{createBy},#{createTime,jdbcType=TIMESTAMP})"})
	@Options(useGeneratedKeys=true,keyProperty="id")
	int insert(SysRole role);
	
	/*
	 * insert返回非自增主键
	 */
	@Insert({"insert into sys_role(roel_name,enabled,creat_by,creat_time) ",
             "values(#{roleName},#{enable},#{createBy},#{createTime,jdbcType=TIMESTAMP})"})
	@SelectKey(before = false, keyProperty = "id", resultType = Long.class, statement = { "select LAST_INSERT_ID()" })
	int insert2(SysRole role);
	
	/*
	 * update
	 */
	@Update(value = { "update sys_role set ",
			          "roel_name=#{roleName},",
			          "enabled=#{enable},",
			          "creat_by=#{createBy},",
			          "creat_time=#{createTime,jdbcType=TIMESTAMP} ",
			          "where id=#{id}"})
	int updateById(SysRole role);
	
	/*
	 * delete
	 */
	@Delete({"delete from sys_role where id=#{id}"})
	int deleteById(Long id);
	
	/*
	 * @SelectProvider用法
	 */
	@SelectProvider(method = "selectByIdPro", type = RoleMapperProvider.class)
	SysRole selectByIdPro(Long id);
}
