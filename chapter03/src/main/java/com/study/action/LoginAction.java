package com.study.action;

public class LoginAction {
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

    /**
     * 执行方法
     */
    public String execute(){
        //这里的逻辑设置为 用户名等于密码 即可登录
        boolean isLogin;
        isLogin = username.equals(password);

        return isLogin ? "success" : "error";
    }
}
