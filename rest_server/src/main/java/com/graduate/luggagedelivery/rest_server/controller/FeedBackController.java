package com.graduate.luggagedelivery.rest_server.controller;

import com.graduate.luggagedelivery.rest_server.base.WrapperList;
import com.graduate.luggagedelivery.rest_server.entity.TFeedback;
import com.graduate.luggagedelivery.rest_server.service.IFeedBackService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/feedback")
public class FeedBackController {
    @Resource
    private IFeedBackService feedBackService;

    /**
     * 添加反馈信息
     *
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public WrapperList<TFeedback> addFeedBack(@RequestBody TFeedback feedback) {
        return feedBackService.addFeedBack(feedback);
    }

    /**
     * 查询反馈信息
     *
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public WrapperList<TFeedback> queryFeedbacks(@RequestParam String phone) {
        return feedBackService.queryFeedbacks(phone);
    }
}
