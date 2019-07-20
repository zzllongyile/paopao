package com.xcy.controller;

import com.xcy.pojo.Account;
import com.xcy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/findAll")
    @ResponseBody
    public Account findAll(int id){
        return accountService.findAll(id);
    }
}
