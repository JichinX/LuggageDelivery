package com.graduate.luggagedelivery.rest_server.controller;

import com.graduate.luggagedelivery.rest_server.base.WrapperList;
import com.graduate.luggagedelivery.rest_server.entity.TDept;
import com.graduate.luggagedelivery.rest_server.service.IDeptService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Resource
    private IDeptService deptService;

    /**
     * 查询站点列表
     *
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public WrapperList<TDept> getDepts() {
        return deptService.getDepts();
    }

    /**
     * 添加站点
     *
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public WrapperList<TDept> addDept(TDept dept) {
        return deptService.addDept(dept);
    }

}
