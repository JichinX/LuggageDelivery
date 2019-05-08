package com.graduate.luggagedelivery.rest_server.service;

import com.graduate.luggagedelivery.rest_server.base.Status;
import com.graduate.luggagedelivery.rest_server.base.WrapperEntity;
import com.graduate.luggagedelivery.rest_server.base.WrapperList;
import com.graduate.luggagedelivery.rest_server.dao.TFlowLogMapper;
import com.graduate.luggagedelivery.rest_server.dao.TUserOrderMapper;
import com.graduate.luggagedelivery.rest_server.entity.TFlowLog;
import com.graduate.luggagedelivery.rest_server.entity.TFlowLogExample;
import com.graduate.luggagedelivery.rest_server.entity.TUserOrder;
import com.graduate.luggagedelivery.rest_server.entity.TUserOrderExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IOrderServiceImpl implements IOrderService {
    @Resource
    private TUserOrderMapper orderMapper;
    @Resource
    private TFlowLogMapper logMapper;

    @Override
    public WrapperList<TUserOrder> getOrderSent(String phone) {
        TUserOrderExample example = new TUserOrderExample();
        example.createCriteria().andFromuserphoneEqualTo(phone);
        List<TUserOrder> orders = orderMapper.selectByExample(example);
        if (null == orders) {
            return new WrapperList<>(Status.QUERY_FAILED);
        }
        return new WrapperList<>(orders);
    }

    @Override
    public WrapperEntity<TUserOrder> queryOrder(long id) {

        return new WrapperEntity<>(orderMapper.selectByPrimaryKey(id));
    }

    @Override
    public WrapperList<TUserOrder> getOrderRecv(String phone) {
        TUserOrderExample example = new TUserOrderExample();
        example.createCriteria().andUserphoneEqualTo(phone);
        return new WrapperList<>(orderMapper.selectByExample(example));
    }

    @Override
    public WrapperList<TFlowLog> getOrderFlow(long id) {
        TFlowLogExample example = new TFlowLogExample();
        example.createCriteria().andUserOrderIdEqualTo(id);
        return new WrapperList<>(logMapper.selectByExample(example));
    }

    @Override
    public WrapperEntity<Void> addOrder(TUserOrder order) {
        int result = orderMapper.insert(order);
        if (result > 0) {
            return new WrapperEntity<>(Status.SUCCESS);
        }
        return new WrapperEntity<>(Status.INSERT_FAILED);
    }
}
