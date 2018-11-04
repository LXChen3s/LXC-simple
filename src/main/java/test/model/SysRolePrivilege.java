package test.model;

/**
 *   sys_role_privilege表
 */
public class SysRolePrivilege {
    /**
     *   角色id
     *   roel_id
     */
    private Long roelId;

    /**
     *   权限id
     *   privilege_id
     */
    private Long privilegeId;

    public Long getRoelId() {
        return roelId;
    }

    public void setRoelId(Long roelId) {
        this.roelId = roelId;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}