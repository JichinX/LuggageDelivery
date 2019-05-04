package me.xujichang.luggagedelivery.base;

import java.util.ArrayList;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.base
 *
 * @author xujichang
 * @date 2019-05-04 - 17:48
 * <p>
 * modify:
 */
public class WrapperEntity<T> {
    private int code;
    private String msg;
    private T data;

    public WrapperEntity(int code, String message) {
        this.code = code;
        this.msg = message;
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

    public String toErrorString() {
        return String.format("%s:%s", String.valueOf(code), msg);
    }
}
