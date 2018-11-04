package test.model;

/**
 *   sys_privilege表
 */
public class SysPrivilege {
    /**
     *   权限id
     *   id
     */
    private Long id;

    /**
     *   权限名称
     *   privilege_name
     */
    private String privilegeName;

    /**
     *   权限url
     *   privilege_url
     */
    private String privilegeUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }
}