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

    private String token;

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserLoginResp{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
