package me.xujichang.luggagedelivery.ui.main.adapter;

import me.xujichang.luggagedelivery.util.IItemCommonListener;

public interface IOrderAdapterListener<T> {
    void onDetail(T src);

    void onFlow(T src);
}
