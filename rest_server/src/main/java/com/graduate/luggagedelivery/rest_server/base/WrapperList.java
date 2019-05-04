package com.graduate.luggagedelivery.rest_server.base;

import java.util.ArrayList;

public class WrapperList<T> {
    private int page;
    private int size;
    private ArrayList<T> data;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<T> getData() {
        return data;
    }

    public void setData(ArrayList<T> data) {
        this.data = data;
    }
}
