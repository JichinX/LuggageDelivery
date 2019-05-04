package com.graduate.luggagedelivery.rest_server.base;

public class WrapperEntity<T> {
    private int code;
    private String msg;
    private T data;

    public WrapperEntity(Status status, T data) {
        this.data = data;
        code = status.getCode();
        msg = status.getMsg();
    }

    public WrapperEntity(T data) {
        this.data = data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
