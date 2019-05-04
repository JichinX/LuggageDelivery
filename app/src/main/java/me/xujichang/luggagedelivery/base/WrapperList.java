package me.xujichang.luggagedelivery.base;

import java.util.ArrayList;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.base
 *
 * @author xujichang
 * @date 2019-05-04 - 17:49
 * <p>
 * modify:
 */
public class WrapperList<T> {
    private int code;
    private String msg;
    private ArrayList<T> data;

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

    public ArrayList<T> getData() {
        return data;
    }

    public void setData(ArrayList<T> data) {
        this.data = data;
    }
}
