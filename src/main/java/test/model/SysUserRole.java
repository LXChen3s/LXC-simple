package test.model;

/**
 *   sys_user_role表
 */
public class SysUserRole {
    /**
     *   用户id
     *   user_id
     */
    private Long userId;

    /**
     *   角色id
     *   role_id
     */
    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}