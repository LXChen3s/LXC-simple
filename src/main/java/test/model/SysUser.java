package test.model;

import java.util.Date;

/**
 *   sys_user表
 */
public class SysUser {
    /**
     *   用户id
     *   id
     */
    private Long id;

    /**
     *   用户名
     *   user_name
     */
    private String userName;

    /**
     *   密码
     *   user_password
     */
    private String userPassword;

    /**
     *   邮箱
     *   user_email
     */
    private String userEmail;

    /**
     *   创建时间
     *   creat_time
     */
    private Date creatTime;

    /**
     *   简介
     *   user_info
     */
    private String userInfo;

    /**
     *   头像
     *   head_img
     */
    private byte[] headImg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public byte[] getHeadImg() {
        return headImg;
    }

    public void setHeadImg(byte[] headImg) {
        this.headImg = headImg;
    }
}