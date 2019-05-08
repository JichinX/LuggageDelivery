package com.graduate.luggagedelivery.rest_server.service;

import com.graduate.luggagedelivery.rest_server.base.WrapperEntity;
import com.graduate.luggagedelivery.rest_server.base.WrapperList;
import com.graduate.luggagedelivery.rest_server.entity.TFlowLog;
import com.graduate.luggagedelivery.rest_server.entity.TUserOrder;

/**
 * 订单 相关
 */
public interface IOrderService {

    /**
     * 获取寄件
     *
     * @return
     */
    WrapperList<TUserOrder> getOrderSent(String phone);

    /**
     * 根据单号查询 寄件
     *
     * @return
     */
    WrapperEntity<TUserOrder> queryOrder(long id);

    /**
     * 获取收件
     *
     * @return
     */
    WrapperList<TUserOrder> getOrderRecv(String phone);

    /**
     * 查看物流
     *
     * @return
     */
    WrapperList<TFlowLog> getOrderFlow(long id);

    /**
     * 新增寄件
     *
     * @return
     */
    WrapperEntity<Void> addOrder(TUserOrder order);


}
