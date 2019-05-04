package com.graduate.luggagedelivery.rest_server.service;

import com.graduate.luggagedelivery.rest_server.base.WrapperEntity;

public interface IUserService {

    WrapperEntity<Boolean> userLogin(String account, String password);
}
