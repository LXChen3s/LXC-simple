package tk.mybatis.simple.model;

import java.util.Date;
import java.util.List;

/**
 * 角色表
 * @author lixingchen
 *
 */
public class SysRole {
	private Long id;
	private String roleName;
	private Long enable;
	private Long createBy;
	private Date createTime;
	
	private SysUser user;
	private List<SysPrivilege> privileges;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Long getEnable() {
		return enable;
	}
	public void setEnable(Long enable) {
		this.enable = enable;
	}
	public Long getCreateBy() {
		return createBy;
	}
	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public List<SysPrivilege> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(List<SysPrivilege> privileges) {
		this.privileges = privileges;
	}
}
