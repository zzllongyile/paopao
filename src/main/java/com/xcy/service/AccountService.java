package com.xcy.service;

import com.xcy.pojo.CollectionAccount;
import io.swagger.annotations.ApiParam;
import sun.security.krb5.internal.Ticket;

import java.util.List;

public interface AccountService {

    String updatePhoneNumById(int  id,int newPhoneNum);
    String showPhoneNumById(int  phoneNum);
    Boolean updatePasswordById(int phoneNum,int password);
    Boolean showPasswordById(int phoneNum);
    Boolean insertCollectionAccount(int phoneNum,CollectionAccount collectionAccount);
    List<CollectionAccount> showCollectionAccount(int phoneNum);
    List<Ticket> selectAllCouponById(int phoneNum);

}
