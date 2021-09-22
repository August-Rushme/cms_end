package com.august.cms.domain;

import java.util.Date;

/**
 * @author 战神
 */
public class UserInfo {
    private Integer id;

    private String userName;

    private String userPassword;

    private String userRealname;

    private Date userCreatedat;

    private Date userUpdateat;

    private String userEnable;

    private Long userCellphone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    public Date getUserCreatedat() {
        return userCreatedat;
    }

    public void setUserCreatedat(Date userCreatedat) {
        this.userCreatedat = userCreatedat;
    }

    public Date getUserUpdateat() {
        return userUpdateat;
    }

    public void setUserUpdateat(Date userUpdateat) {
        this.userUpdateat = userUpdateat;
    }

    public String getUserEnable() {
        return userEnable;
    }

    public void setUserEnable(String userEnable) {
        this.userEnable = userEnable;
    }

    public Long getUserCellphone() {
        return userCellphone;
    }

    public void setUserCellphone(Long userCellphone) {
        this.userCellphone = userCellphone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userRealname=").append(userRealname);
        sb.append(", userCreatedat=").append(userCreatedat);
        sb.append(", userUpdateat=").append(userUpdateat);
        sb.append(", userEnable=").append(userEnable);
        sb.append(", userCellphone=").append(userCellphone);
        sb.append("]");
        return sb.toString();
    }
}