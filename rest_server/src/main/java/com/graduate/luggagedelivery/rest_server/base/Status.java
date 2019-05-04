package com.graduate.luggagedelivery.rest_server.base;

public enum Status {
    SUCCESS(200, "成功"),
    LOGIN_FAILED(300, "登录失败");
    private int code;
    private String msg;

    Status() {
    }

    Status(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
