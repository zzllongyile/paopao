package com.xcy.service.impl;

import com.xcy.mapper.AccountMapper;
import com.xcy.pojo.CollectionAccount;
import com.xcy.pojo.User;
import com.xcy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.Mapping;
import sun.security.krb5.internal.Ticket;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    AccountMapper accountMapper;


    @Override
    public String updatePhoneNumById(int id, int newPhoneNum) {



        int i = accountMapper.updatePhoneNumById(new User(id,newPhoneNum));
        if (i!=1){
            return "false";
        }
        return "true";
    }

    @Override
    public String showPhoneNumById(int id) {


        return null;
    }

    @Override
    public Boolean updatePasswordById(int id, int password) {

        int i = accountMapper.updatePasswordById(id, password);


        if (i!=1){
            return false;
        }
        return true;
    }

    @Override
    public Boolean showPasswordById(int phoneNum) {
        return null;
    }


    @Override
    public Boolean insertCollectionAccount(int phoneNum, CollectionAccount collectionAccount) {
        return null;
    }

    @Override
    public List<CollectionAccount> showCollectionAccount(int phoneNum) {
        return null;
    }

    @Override
    public List<Ticket> selectAllCouponById(int phoneNum) {
        return null;
    }
}
