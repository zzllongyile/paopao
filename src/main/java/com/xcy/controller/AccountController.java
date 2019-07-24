package com.xcy.controller;


import com.xcy.pojo.Account;
import com.xcy.pojo.User;
import com.xcy.service.AccountService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @ApiOperation(value = "查询个人信息")
    @RequestMapping("/selectMsg")
    @ResponseBody
    public List<Account> selectUserMsg(Account account){
        List<Account> accountList = accountService.selectUserMsg(account);
        return accountList;

    }

    @ApiOperation(value = "保存个人信息")
    @RequestMapping("/saveMsg")
    @ResponseBody
    public void saveMsg(Account account){

        accountService.saveMsg(account);

    }

    @ApiOperation(value = "修改个人信息")
    @RequestMapping("/updateMsg")
    @ResponseBody
    public void updateMsg(Account account){
        accountService.updateMsg(account);

    }

    @ApiOperation(value = "用户等级")
    @RequestMapping("/selectUserLevel")
    @ResponseBody
    public String selectUserLevel(Account account){
        return accountService.selectUserLevel(account);
    }

    @ApiOperation(value = "账户充值 参数：前端的传来的money值" +
            "返回值 success or  fail")
    @RequestMapping("/")
    @ResponseBody
    public String updateAccountMoney(Account money){
        return accountService.updateAccountMoney(money);

    }


}
