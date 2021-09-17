package com.august.cms.req;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * @author August
 * @date 2021/9/17 16:45
 * @lastEditors: August
 * @version:1.0
 */
public class UserLoginReq {
    @NotEmpty(message = "[用户名]不能为空")
    private String userName;
    @NotEmpty(message = "[密码]不能为空")
    @Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,32}$", message = "【密码】规则不正确")
    private String userPassword;

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
}
