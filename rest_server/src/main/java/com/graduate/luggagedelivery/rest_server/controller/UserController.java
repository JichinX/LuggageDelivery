package com.graduate.luggagedelivery.rest_server.controller;

import com.graduate.luggagedelivery.rest_server.base.WrapperEntity;
import com.graduate.luggagedelivery.rest_server.entity.TUser;
import com.graduate.luggagedelivery.rest_server.service.IUserService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 登录看相关逻辑
 */
@RestController
@RequestMapping(value = "/user")
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
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public WrapperEntity<TUser> login(@RequestParam String uName, @RequestParam String uPwd) {
        if (Strings.isNotEmpty(uName)) {
            uName = uName.toUpperCase();
        }
        if (Strings.isNotEmpty(uPwd)) {
            uPwd = uPwd.toUpperCase();
        }
        return userService.userLogin(uName, uPwd);
    }

    /**
     * 更新用户信息
     *
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public WrapperEntity<TUser> updateUserInfo(@RequestBody TUser user) {
        return userService.updateUserInfo(user);
    }
}
