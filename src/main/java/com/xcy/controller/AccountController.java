package com.xcy.controller;

import com.xcy.pojo.CollectionAccount;
import com.xcy.service.AccountService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.krb5.internal.Ticket;

import java.util.List;




import com.xcy.pojo.Account;
import com.xcy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class AccountController {

    @Autowired
    AccountService accountService;




    @ApiOperation(value = "修改手机号   返回值：true false")
    @RequestMapping("/updatePhoneNumById")
    @ResponseBody
    public String updatePhoneNumById(@ApiParam("用户ID")int id, @ApiParam("新手机号")int newPhoneNum, HttpServletResponse response){

        response.setHeader("Access-Control-Allow-Origin","*");


        String result = accountService.updatePhoneNumById(id,newPhoneNum);

        return result;
    }



    @ApiOperation(value = "修改密码   返回值：true false")
    @RequestMapping("/updatePasswordById")
    @ResponseBody
    public Boolean updatePasswordById(@ApiParam("用户ID")int id,@ApiParam("密码")int password, HttpServletResponse response){

        response.setHeader("Access-Control-Allow-Origin","*");
        Boolean aBoolean = accountService.updatePasswordById(id, password);

        return aBoolean;
    }



    @ApiOperation(value = "新增代收货款账户   返回值：true false")
    @RequestMapping("/insertCollectionAccount")
    @ResponseBody
    public Boolean insertCollectionAccount(@ApiParam("用户ID")int id, @ApiParam("新账户") CollectionAccount collectionAccount, HttpServletResponse response){

        response.setHeader("Access-Control-Allow-Origin","*");
        Boolean aBoolean = accountService.insertCollectionAccount(id, collectionAccount);

        return  aBoolean;
    }


    @ApiOperation(value = "展示代收货款账户   返回值：CollectionAccount(代收账户账户名，代收账户账户)")
    @RequestMapping("/showCollectionAccount")
    @ResponseBody
    public List<CollectionAccount> showCollectionAccount(@ApiParam("用户ID")int id, CollectionAccount collectionAccount, HttpServletResponse response){

        response.setHeader("Access-Control-Allow-Origin","*");
        List<CollectionAccount> collectionAccounts = accountService.showCollectionAccount(id);


        return collectionAccounts;
    }

    @ApiOperation(value = "退出账户  返回值  true false")
    @RequestMapping("/loginOut")
    @ResponseBody
    public Boolean loginOut(@ApiParam("用户ID")int id, HttpServletResponse response){

        response.setHeader("Access-Control-Allow-Origin","*");

        return true;
    }


    @ApiOperation(value = "展示用户优惠券  返回值 json字符串")
    @RequestMapping("/selectAllCouponById")
    @ResponseBody
    public List<Ticket> selectAllCouponById(@ApiParam("用户ID")int id, HttpServletResponse response){

        response.setHeader("Access-Control-Allow-Origin","*");
        List<Ticket> tickets = accountService.selectAllCouponById(id);

        return tickets;
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public Account findAll(int id){
        return accountService.findAll(id);
    }
}
