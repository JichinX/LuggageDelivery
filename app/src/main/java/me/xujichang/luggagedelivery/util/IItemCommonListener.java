package me.xujichang.luggagedelivery.util;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.util
 *
 * @author xujichang
 * @date 2019-04-26 - 01:11
 * <p>
 * modify:
 */
public interface IItemCommonListener<T> {
    void onLoadMore(int position, T data);

    void onItemClick(int position, T data);

    void onItemLongClick(int position, T data);
}
