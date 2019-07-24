package com.xcy.service;

import com.xcy.pojo.User;

public interface UserService {

    Boolean loginUser(User user);

    Boolean validatePhoneNum(String phoneNum);

    int insertUser(User user);

    int getUserId(User user);
}
