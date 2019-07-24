package com.xcy.mapper;

import com.xcy.pojo.*;
import com.xcy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper
public interface AccountMapper {

    List<Account> selectUserMsg(Account account);

    void saveMsgById(Account account);

    void updateMsgById(Account account);

    String selectUserLevel(Account account);

    int updateAccountMoney(Account money);

    int updatePhoneNumById(User user);
    String showPhoneNumById(int  phoneNum);
    int updatePasswordById(int phoneNum,int password);
    String showPasswordById(int phoneNum);
    int insertCollectionAccount(int phoneNum, CollectionAccount collectionAccount);
    List<CollectionAccount> showCollectionAccount(int phoneNum);
    List<Ticket> selectAllCouponById(int phoneNum);
    Account findAll(int id);
}
