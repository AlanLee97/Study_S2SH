package com.study.action;

import com.study.interfaces.MyAction;

/**
 * 实现Action接口，使代码编写更规范
 */

public class LoginAction2 implements MyAction {
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

    public String execute() throws Exception {
        boolean isLogin;
        isLogin = username.equals(password);
        return isLogin ? "success" : "error";
    }
}
