package tk.mybatis.simple.mapper;

import org.apache.ibatis.jdbc.SQL;

public class RoleMapperProvider {
	public String selectByIdPro(final Long id) {
		return new SQL() {
			{
				SELECT("id");
				FROM("sys_role");
				WHERE("id=#{id}");
			}
		}.toString();
	}
}
