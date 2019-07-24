package com.xcy.controller;


import com.xcy.pojo.User;
import com.xcy.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @Autowired
    UserService userService;


    @ApiOperation(value="登录")
    @CrossOrigin  //跨域注解
    @RequestMapping("/login")
    @ResponseBody
    public String loginUser(@ApiParam("用户账号 密码")User user, HttpServletResponse response){

        response.setHeader("Access-Control-Allow-Origin","*");


        Boolean result = userService.loginUser(user);

        if(result){
            String id = String.valueOf(userService.getUserId(user));
            return id;
        }else {
            return "fail";
        }


    }

    @ApiOperation(value="注册号码校验")
    @RequestMapping("/validate")
    @ResponseBody
    public String validatePhoneNum(@ApiParam("注册号码")String phoneNum){
        Boolean isExist = userService.validatePhoneNum(phoneNum);
        return isExist?"fail":"success";
    }
    @CrossOrigin  //跨域注解
    @ApiOperation(value="注册")
    @RequestMapping("insertUser")
    @ResponseBody
    public String insertUser(@ApiParam("注册用户账号 密码")User user, HttpServletResponse response){

        response.setHeader("Access-Control-Allow-Origin","*");

        int result = userService.insertUser(user);
        String id = String.valueOf(userService.getUserId(user));
        return result>0?id:"fail";
    }

}
