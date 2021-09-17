package com.august.cms.resp;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author August
 * @date 2021/9/17 16:49
 * @lastEditors: August
 * @version:1.0
 */
public class UserLoginResp {
    private Integer id;

    private String userName;

    private String userPassword;

    private String userRealname;

    private Date userCreatedat;

    private Date userUpdateat;

    private String userEnable;

    private Long userCellphone;

    private String token;

    private Object menus;

    private Object role;

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Object getMenus() {
        return menus;
    }

    public void setMenus(Object menus) {
        this.menus = menus;
    }

    public Object getRole() {
        return role;
    }

    public void setRole(Object role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserLoginResp{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRealname='" + userRealname + '\'' +
                ", userCreatedat=" + userCreatedat +
                ", userUpdateat=" + userUpdateat +
                ", userEnable='" + userEnable + '\'' +
                ", userCellphone=" + userCellphone +
                ", token='" + token + '\'' +
                ", menus=" + menus +
                ", role=" + role +
                '}';
    }
}
