package com.graduate.luggagedelivery.rest_server.base;

import java.util.List;

public class WrapperList<T> {
    private String msg;
    private int code;
    private List<T> data;

    public WrapperList(Status status) {
        code = status.getCode();
        msg = status.getMsg();
    }

    public WrapperList(List<T> data) {
        this(null == data ? Status.QUERY_FAILED : Status.SUCCESS);
        this.data = data;
    }

    public WrapperList() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public void setStatus(Status success) {
        code = success.getCode();
        msg = success.getMsg();
    }
}
