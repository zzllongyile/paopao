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


@Controller
public class AccountController {

    @Autowired
    AccountService accountService;




    @ApiOperation(value = "修改手机号   返回值：true false")
    @RequestMapping("/updatePhoneNumById")
    public String updatePhoneNumById(@ApiParam("用户ID")int id,@ApiParam("新手机号")int newPhoneNum){



        String result = accountService.updatePhoneNumById(id,newPhoneNum);

        return result;
    }



    @ApiOperation(value = "修改密码   返回值：true false")
    @RequestMapping("/updatePasswordById")
    public Boolean updatePasswordById(@ApiParam("用户ID")int id,@ApiParam("密码")int password){

        Boolean aBoolean = accountService.updatePasswordById(id, password);

        return aBoolean;
    }



    @ApiOperation(value = "新增代收货款账户   返回值：true false")
    @RequestMapping("/insertCollectionAccount")
    public Boolean insertCollectionAccount(@ApiParam("用户ID")int id, @ApiParam("新账户") CollectionAccount collectionAccount){


        return  true;
    }


    @ApiOperation(value = "展示代收货款账户   返回值：CollectionAccount(代收账户账户名，代收账户账户)")
    @RequestMapping("/showCollectionAccount")
    public String showCollectionAccount(@ApiParam("用户ID")int id, CollectionAccount collectionAccount){


        return "collectionAccount";
    }

    @ApiOperation(value = "退出账户  返回值  true false")
    @RequestMapping("/loginOut")
    public Boolean loginOut(@ApiParam("用户ID")int id){


        return false;
    }


    @ApiOperation(value = "展示用户优惠券  返回值 json字符串")
    @RequestMapping("/selectAllCouponById")
    public List<Ticket> selectAllCouponById(@ApiParam("用户ID")int id){


        return null;
    @RequestMapping("/findAll")
    @ResponseBody
    public Account findAll(int id){
        return accountService.findAll(id);
    }
}
