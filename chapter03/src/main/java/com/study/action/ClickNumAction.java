package com.study.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 点击按钮 增加数字 类
 */
public class ClickNumAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        ActionContext actionContext = ActionContext.getContext();
        Integer num = (Integer) actionContext.getApplication().get("num");
        if (num == null){
            num = 1;
        }else {
            num++;
        }

        actionContext.getApplication().put("num", num);
        return  SUCCESS;
    }
}
