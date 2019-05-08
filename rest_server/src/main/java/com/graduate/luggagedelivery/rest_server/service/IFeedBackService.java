package com.graduate.luggagedelivery.rest_server.service;

import com.graduate.luggagedelivery.rest_server.base.WrapperEntity;
import com.graduate.luggagedelivery.rest_server.base.WrapperList;
import com.graduate.luggagedelivery.rest_server.entity.TFeedback;

/**
 * 反馈信息
 */
public interface IFeedBackService {
    /**
     * 添加反馈信息
     *
     * @return
     */
    WrapperList<TFeedback> addFeedBack(TFeedback feedback);

    /**
     * 查询反馈信息
     *
     * @return
     */
    WrapperList<TFeedback> queryFeedbacks(String phone);
}
