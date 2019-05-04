package com.graduate.luggagedelivery.rest_server.controller;

import com.graduate.luggagedelivery.rest_server.base.WrapperEntity;
import com.graduate.luggagedelivery.rest_server.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 登录看相关逻辑
 */
@RestController(value = "/login")
public class UserController {
    @Resource
    private IUserService userService;

    /**
     * 登录
     *
     * @param uName
     * @param uPwd
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public WrapperEntity<Boolean> login(@RequestParam String uName, @RequestParam String uPwd) {
        return userService.userLogin(uName, uPwd);
    }

}
