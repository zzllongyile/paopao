package com.xcy.service.impl;

import com.xcy.mapper.AccountMapper;
import com.xcy.pojo.Account;
import com.xcy.pojo.User;
import com.xcy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public List<Account> selectUserMsg(Account account) {
        List<Account> accountList = accountMapper.selectUserMsg(account);
        return accountList;
    }

  @Override
    public int saveMsg(Account account) {
        accountMapper.saveMsgById(account);
        int id = account.getId();
        return id;
    }

    @Override
    public int updateMsg(Account account) {
        accountMapper.updateMsgById(account);
        int id = account.getId();
        return id;
    }

    @Override
    public String selectUserLevel(Account account) {
        return accountMapper.selectUserLevel(account);
    }

    @Override
    public String updateAccountMoney(Account money) {
        int i = accountMapper.updateAccountMoney(money);
        if(i != 1){return "fail";}
        return "success";
    }


}
