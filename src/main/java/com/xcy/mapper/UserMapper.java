package com.xcy.mapper;

import com.xcy.pojo.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {

    int loginUser(User user);

    int validatePhoneNum(String phoneNum);

    int insertUser(User user);

    int getUserId(User user);

}
