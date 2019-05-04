package com.graduate.luggagedelivery.rest_server.service;

import com.graduate.luggagedelivery.rest_server.base.WrapperEntity;
import com.graduate.luggagedelivery.rest_server.entity.TUser;

public interface IUserService {

    WrapperEntity<TUser> userLogin(String account, String password);
}
