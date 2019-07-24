package com.xcy.mapper;

import com.xcy.pojo.Account;
import com.xcy.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {

    List<Account> selectUserMsg(Account account);

    void saveMsgById(Account account);

    void updateMsgById(Account account);

    String selectUserLevel(Account account);

    int updateAccountMoney(Account money);

}
