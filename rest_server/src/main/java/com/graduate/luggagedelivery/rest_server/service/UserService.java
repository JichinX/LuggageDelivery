package com.graduate.luggagedelivery.rest_server.service;

import com.graduate.luggagedelivery.rest_server.base.Status;
import com.graduate.luggagedelivery.rest_server.base.WrapperEntity;
import com.graduate.luggagedelivery.rest_server.dao.TUserMapper;
import com.graduate.luggagedelivery.rest_server.entity.TUser;
import com.graduate.luggagedelivery.rest_server.entity.TUserExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户相关接口
 */
@Service
public class UserService implements IUserService {
    @Resource
    private TUserMapper userMapper;

    /**
     * 用户登录
     *
     * @param account
     * @param password
     * @return
     */
    @Override
    public WrapperEntity<Boolean> userLogin(String account, String password) {
        boolean success;
        TUserExample example = new TUserExample();
        example.createCriteria().andUnameEqualTo(account).andUserpasswordEqualTo(password);
        List<TUser> users = userMapper.selectByExample(example);
        success = null != users && users.size() != 0;
        return new WrapperEntity<>((success ? Status.SUCCESS : Status.LOGIN_FAILED), success);
    }
}
