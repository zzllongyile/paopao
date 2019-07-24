package com.xcy.service;

import com.xcy.pojo.Account;
import com.xcy.pojo.CollectionAccount;
import com.xcy.pojo.Ticket;
import com.xcy.pojo.User;

import java.util.List;

public interface AccountService {

    List<Account> selectUserMsg(Account account);

   int saveMsg(Account account);

    int updateMsg(Account account);

    String selectUserLevel(Account account);

    String updateAccountMoney(Account money);



    String updatePhoneNumById(int  id,int newPhoneNum);
    String showPhoneNumById(int  phoneNum);
    Boolean updatePasswordById(int phoneNum,int password);
    String showPasswordById(int phoneNum);
    Boolean insertCollectionAccount(int phoneNum, CollectionAccount collectionAccount);
    List<CollectionAccount> showCollectionAccount(int phoneNum);
    List<Ticket> selectAllCouponById(int phoneNum);

    Account findAll(int id);
}
