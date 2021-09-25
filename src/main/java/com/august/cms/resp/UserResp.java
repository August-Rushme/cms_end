package com.august.cms.resp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author August
 * @date 2021/9/25 15:03
 * @lastEditors: August
 * @version:1.0
 */
public class UserResp {
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private String cellphone;

    private String email;

    private Date createdat;

    private Date updatedat;

    private String statuts;

    private List<RoleResp> roles = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    public String getStatuts() {
        return statuts;
    }

    public void setStatuts(String statuts) {
        this.statuts = statuts;
    }

    public List<RoleResp> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleResp> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserReq{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", email='" + email + '\'' +
                ", createdat=" + createdat +
                ", updatedat=" + updatedat +
                ", statuts='" + statuts + '\'' +
                ", roles=" + roles +
                '}';
    }
}
