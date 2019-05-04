package com.graduate.luggagedelivery.rest_server.entity;

public class TTransportOrder {
    private Long id;

    private Long transId;

    private Long userOrderId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTransId() {
        return transId;
    }

    public void setTransId(Long transId) {
        this.transId = transId;
    }

    public Long getUserOrderId() {
        return userOrderId;
    }

    public void setUserOrderId(Long userOrderId) {
        this.userOrderId = userOrderId;
    }
}