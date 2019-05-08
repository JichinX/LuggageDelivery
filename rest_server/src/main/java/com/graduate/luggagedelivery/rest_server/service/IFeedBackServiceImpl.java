package com.graduate.luggagedelivery.rest_server.service;

import com.graduate.luggagedelivery.rest_server.base.Status;
import com.graduate.luggagedelivery.rest_server.base.WrapperList;
import com.graduate.luggagedelivery.rest_server.dao.TFeedbackMapper;
import com.graduate.luggagedelivery.rest_server.entity.TFeedback;
import com.graduate.luggagedelivery.rest_server.entity.TFeedbackExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IFeedBackServiceImpl implements IFeedBackService {
    @Resource
    private TFeedbackMapper mapper;

    @Override
    public WrapperList<TFeedback> addFeedBack(TFeedback feedback) {
        int result = mapper.insertSelective(feedback);
        if (result > 0) {
            return queryFeedbacks(feedback.getUserphone());
        }
        return new WrapperList<>(Status.INSERT_FAILED);
    }

    @Override
    public WrapperList<TFeedback> queryFeedbacks(String phone) {
        TFeedbackExample example = new TFeedbackExample();
        example.createCriteria().andUserphoneEqualTo(phone);
        List<TFeedback> tFeedbacks = mapper.selectByExampleWithBLOBs(example);
        if (null == tFeedbacks) {
            return new WrapperList<>(Status.QUERY_FAILED);
        }
        return new WrapperList<>(tFeedbacks);
    }
}
