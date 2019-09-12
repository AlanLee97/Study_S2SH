package com.study.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 继承ActionSupport类
 * Action处理类
 * 对用户的请求进行处理
 * 可以简化Action的开发，从而节省时间，提高效率
 */
public class LoginAction3 extends ActionSupport {
    private String username;
    private String password;

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

    boolean isLogin = false;

    public String execute(){
        isLogin = username.equals(password);
        return isLogin ? "success" : "error";
    }

    @Override
    public void validate() {
        boolean isUnEmpty = username.equals("");
        boolean isPaEmpty = password.equals("");
        if (isUnEmpty){
            this.addFieldError("username", "用户名不能为空");
        }

        if (isPaEmpty){
            this.addFieldError("password", "密码不能为空");
        }

    }
}
