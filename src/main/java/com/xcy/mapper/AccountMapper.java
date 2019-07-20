package com.xcy.mapper;

import com.xcy.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    Account findAll(int id);
}
