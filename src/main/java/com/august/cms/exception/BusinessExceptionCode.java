package com.august.cms.exception;
/**
 * @author august
 * 自定义异常
 */
public enum BusinessExceptionCode {
    /**
     * 用户名已经存在异常
     */
    USER_LOGIN_NAME_EXIST("用户名已存在"),
    /**
     * 用户名不存在或密码错误
     */
    LOGIN_USER_ERROR("用户名不存在或密码错误"),
    ;

    private String desc;

    BusinessExceptionCode(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
