package com.graduate.luggagedelivery.rest_server.service;

import com.graduate.luggagedelivery.rest_server.base.WrapperList;
import com.graduate.luggagedelivery.rest_server.entity.TDept;

/**
 * 站点相关
 */
public interface IDeptService {
    /**
     * 查询站点列表
     *
     * @return
     */
    WrapperList<TDept> getDepts();

    /**
     * 添加站点
     *
     * @return
     */
    WrapperList<TDept> addDept(TDept dept);

}
