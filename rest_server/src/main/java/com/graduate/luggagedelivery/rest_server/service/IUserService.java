package com.graduate.luggagedelivery.rest_server.service;

import com.graduate.luggagedelivery.rest_server.base.WrapperEntity;
import com.graduate.luggagedelivery.rest_server.entity.TUser;

/**
 * 用户相关
 */
public interface IUserService {
    /**
     * 用户登录
     *
     * @param account
     * @param password
     * @return
     */
    WrapperEntity<TUser> userLogin(String account, String password);

    /**
     * 更新用户信息
     *
     * @return
     */
    WrapperEntity<TUser> updateUserInfo(TUser user);
}
