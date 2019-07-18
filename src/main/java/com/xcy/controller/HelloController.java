package com.xcy.controller;


import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//1、访问http://localhost:8080/swagger-ui.html
//2、在方法名和字段上添加swagger文档中的信息
//        1）在方法上添加   @ApiOperation(value=”该方法的作用”)
//        2）在字段上添加   @ApiModelProperty(value =”该字段是干嘛用的”)
//        3）添加在参数上   @ApiParam(“该参数是干嘛用的”)

//@Controller
@RestController
public class HelloController {

    @ApiOperation(value = "输出hello")
    @RequestMapping("/hello")
    public String hello(  @ApiParam("该参数没啥卵用") int a){


        return "hello";
    }

    @ApiOperation(value = "用户注册返回值是true,false")
    @RequestMapping("/register")
    public String register(  @ApiParam("用户手机号") int phoneNum, @ApiParam("用户密码") int password,@ApiParam("用户密码") int code){


        return "hello1";
    }




}
