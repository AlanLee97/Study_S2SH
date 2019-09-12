package com.study.interfaces;


/**
 * 自定义的Action接口，使代码编写更规范
 */
public interface MyAction {
    public static final String SUCCESS = "success";
    public static final String ERROR = "error";
    public static final String LOGIN = "login";
    public static final String NONE = "none";
    public static final String INPUT = "input";

    public String execute() throws Exception;
}
