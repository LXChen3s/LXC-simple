package test.model;

import java.util.Date;

/**
 *   sys_role表
 */
public class SysRole {
    /**
     *   角色id
     *   id
     */
    private Long id;

    /**
     *   角色名
     *   roel_name
     */
    private String roelName;

    /**
     *   有效标志
     *   enabled
     */
    private Integer enabled;

    /**
     *   创建人
     *   creat_by
     */
    private Long creatBy;

    /**
     *   创建时间
     *   creat_time
     */
    private Date creatTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoelName() {
        return roelName;
    }

    public void setRoelName(String roelName) {
        this.roelName = roelName;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Long getCreatBy() {
        return creatBy;
    }

    public void setCreatBy(Long creatBy) {
        this.creatBy = creatBy;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}