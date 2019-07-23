package com.xcy.mapper;

import com.xcy.pojo.Account;
import com.xcy.pojo.CollectionAccount;
import com.xcy.pojo.User;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;
import sun.security.krb5.internal.Ticket;

import java.util.List;

@Mapper
public interface AccountMapper {

    int updatePhoneNumById(User user);
    String showPhoneNumById(int  phoneNum);
    int updatePasswordById(int phoneNum,int password);
    String showPasswordById(int phoneNum);
    int insertCollectionAccount(int phoneNum, CollectionAccount collectionAccount);
    List<CollectionAccount> showCollectionAccount(int phoneNum);
    List<Ticket> selectAllCouponById(int phoneNum);
    Account findAll(int id);
}
