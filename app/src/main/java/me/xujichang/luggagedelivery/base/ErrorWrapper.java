package me.xujichang.luggagedelivery.base;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.base
 *
 * @author xujichang
 * @date 2019-05-04 - 18:15
 * <p>
 * modify:
 */
public class ErrorWrapper<T> extends WrapperEntity<T> {
    public ErrorWrapper(Throwable e) {
        super(500, e.getMessage());
    }
}
