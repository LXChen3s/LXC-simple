package tk.mybatis.simple.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.CacheNamespaceRef;
import org.apache.ibatis.annotations.Param;

import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

@CacheNamespaceRef(UserMapper.class)
public interface UserMapper {
	SysUser selectById(Long id);
	List<SysUser> selectAll();
	/**
	 * 根据用户id获取所有角色
	 */
	List<SysRole> selectRolesByUserId(Long userId);
	/**
	 * 插入用户
	 * int 返回的是插入影响的行数
	 */
	int insert(SysUser user);
	int insert2(SysUser user);
	int insert3(SysUser user);
	/**
	 * 根据主键更新
	 */
	int updateById(SysUser user);
	/**
	 * 通过主键删除
	 */
	int deleteById(Long id);
	/**
	 * 多参数用法
	 */
	List<SysRole> selectRolesByUserIdAndEnabled(@Param("userId")Long userId,@Param("enabled")Integer enabled);
	List<SysRole> selectRolesByUserIdAndEnabled2(@Param("user")SysUser user,@Param("role")SysRole role);
	/**
	 * 动态查询
	 */
	List<SysUser> selectByUser(@Param("user")SysUser user);
	List<SysUser> selectByUser2(SysUser user);
	/**
	 * 动态更新
	 */
	int updateByUser(SysUser user);
	/**
	 * 动态插入
	 */
	int insertByUser(SysUser user);
	/**
	 * 批量查询
	 */
	List<SysUser> selectByIdList(@Param("list1")List<Long> list);
	/**
	 * 批量插入
	 */
	int insertByList(@Param("userlist")List<SysUser> users);
	/**
	 * map动态update
	 */
	int updateByMap(@Param("userMap")Map<String,Object> map);
	
	SysUser selectUserAndRoleById(Long id);
	SysUser selectUserAndRoleById2(Long id);
	SysUser selectUserAndRoleById3(Long id);
	SysUser selectUserAndRoleById4(Long id);
	SysUser selectUserAndRoleById5(Long id);
	SysUser selectUserAndRoleById6(Long id);
	List<SysUser> selectUserAndRoleById7();
	List<SysUser> selectUserAndRoleById8();
}
