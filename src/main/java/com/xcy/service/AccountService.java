package com.xcy.service;

import com.xcy.pojo.Account;
import com.xcy.pojo.User;

import java.util.List;

public interface AccountService {

    List<Account> selectUserMsg(Account account);

   int saveMsg(Account account);

    int updateMsg(Account account);

    String selectUserLevel(Account account);

    String updateAccountMoney(Account money);

}
