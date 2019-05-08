package com.graduate.luggagedelivery.rest_server.controller;

import com.graduate.luggagedelivery.rest_server.base.WrapperEntity;
import com.graduate.luggagedelivery.rest_server.base.WrapperList;
import com.graduate.luggagedelivery.rest_server.entity.TFlowLog;
import com.graduate.luggagedelivery.rest_server.entity.TUserOrder;
import com.graduate.luggagedelivery.rest_server.service.IOrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private IOrderService orderService;

    /**
     * 获取寄件
     *
     * @return
     */
    @RequestMapping(value = "/sent", method = RequestMethod.GET)
    public WrapperList<TUserOrder> getOrderSent(@RequestParam String phone) {
        return orderService.getOrderSent(phone);
    }

    /**
     * 根据单号查询 寄件
     *
     * @return
     */
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public WrapperEntity<TUserOrder> queryOrder(@RequestParam long id) {
        return orderService.queryOrder(id);
    }

    /**
     * 获取收件
     *
     * @return
     */
    @RequestMapping(value = "/recv", method = RequestMethod.GET)
    public WrapperList<TUserOrder> getOrderRecv(@RequestParam String phone) {
        return orderService.getOrderRecv(phone);
    }

    /**
     * 查看物流
     *
     * @return
     */
    @RequestMapping(value = "/flow", method = RequestMethod.GET)
    public WrapperList<TFlowLog> getOrderFlow(@RequestParam long id) {
        return orderService.getOrderFlow(id);
    }

    /**
     * 新增寄件
     *
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public WrapperEntity<Void> addOrder(@RequestBody TUserOrder order) {
        return orderService.addOrder(order);
    }
}
