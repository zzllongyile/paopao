package com.xcy.service.impl;

import com.xcy.mapper.UserMapper;
import com.xcy.pojo.User;
import com.xcy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public Boolean loginUser(User user) {
        int count = userMapper.loginUser(user);
        return count>0? true:false;
    }

    @Override
    public Boolean validatePhoneNum(String phoneNum) {
        int count = userMapper.validatePhoneNum(phoneNum);
        return count>0? true:false;
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int getUserId(User user) {
        return userMapper.getUserId(user);
    }


}
