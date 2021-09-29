package com.august.cms.resp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @author August
 * @date 2021/9/23 16:42
 * @lastEditors: August
 * @version:1.0
 */
public class UserInfoResp<T>{
    private Integer id;

    private String username;

    private String realname;

    private String cellphone;

    private String email;

    private LocalDateTime createdat;

    private LocalDateTime  updatedat;

    private String statuts;

    private List<T> role;

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

    public LocalDateTime  getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDateTime  createdat) {
        this.createdat = createdat;
    }

    public LocalDateTime  getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(LocalDateTime  updatedat) {
        this.updatedat = updatedat;
    }

    public String getStatuts() {
        return statuts;
    }

    public void setStatuts(String statuts) {
        this.statuts = statuts;
    }

    public List getRole() {
        return role;
    }

    public void setRole(List role) {
        this.role = role;
    }



    @Override
    public String toString() {
        return "UserInfoResp{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", email='" + email + '\'' +
                ", createdat=" + createdat +
                ", updatedat=" + updatedat +
                ", statuts='" + statuts + '\'' +
                ", role=" + role +
                '}';
    }
}
