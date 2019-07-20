package com.xcy.service.impl;

import com.xcy.mapper.AccountMapper;
import com.xcy.pojo.Account;
import com.xcy.pojo.User;
import com.xcy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;
    @Override
    public Account findAll(int id) {
        return accountMapper.findAll(id);
    }
}
