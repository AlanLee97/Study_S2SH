package com.study.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 实现ServletRequestAware
 * 使Action能够访问Servlet的API
 */
public class LoginAction4 extends ActionSupport implements ServletRequestAware {
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
        if (isLogin){
            HttpSession session = httpServletRequest.getSession();
            session.setAttribute("CurUser", username);
            return SUCCESS;
        }
        return ERROR;
    }


    private HttpServletRequest httpServletRequest;
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

    @Override
    public void validate() {
        if (username.equals("")){
            this.addFieldError("username", "用户名不能为空");
            System.out.println("用户名不能为空");
        }

        if (password.equals("")){
            this.addFieldError("password", "密码不能为空");
            System.out.println("密码不能为空");
        }



    }
}
