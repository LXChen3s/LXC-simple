package tk.mybatis.simple.model;
/**
 * 角色权限关联表
 * @author lixingchen
 *
 */
public class SysRolePrivilege {
	private Long privilegeId;
	private Long roleId;
	public Long getPrivilegeId() {
		return privilegeId;
	}
	public void setPrivilegeId(Long privilegeId) {
		this.privilegeId = privilegeId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
}
