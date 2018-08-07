package com.hxyl.jason.tool.token20180719;

import com.fasterxml.jackson.annotation.JsonInclude;
//@JsonInclude 注解不返回null值字段
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MSGEntiy {


    public String tokenid;
    //状态号码
    public String status;
    //消息
    public String msg;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTokenid() {
        return tokenid;
    }

    public void setTokenid(String tokenid) {
        this.tokenid = tokenid;
    }
}
