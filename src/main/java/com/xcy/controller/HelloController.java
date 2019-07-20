package com.xcy.controller;


import com.xcy.pojo.*;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.krb5.internal.Ticket;

import java.util.List;

//1、访问http://localhost:8080/swagger-ui.html
//2、在方法名和字段上添加swagger文档中的信息
//        1）在方法上添加   @ApiOperation(value=”该方法的作用”)
//        2）在字段上添加   @ApiModelProperty(value =”该字段是干嘛用的”)
//        3）添加在参数上   @ApiParam(“该参数是干嘛用的”)

//@Controller
//@RestController
//public class HelloController {
//
//    @ApiOperation(value = "输出hello")
//    @RequestMapping("/hello")
//    public String hello(  @ApiParam("该参数没啥卵用") int a){
//
//
//        return "hello";
//    }
//
//    @ApiOperation(value = "用户注册 返回值true,false")
//    @RequestMapping("/register")
//    public String register(  @ApiParam("用户手机号") int phoneNum, @ApiParam("用户密码") int password,@ApiParam("用户密码") int code){
//
//
//        return "hello1";
//    }
//
//    @ApiOperation(value = "查询用户信息 参数：用户账号phoneNum 返回值：json字符串")
//    @RequestMapping("/selectUserMsg")
//    public String selectUserMsg(@RequestBody Account account){
//
//
//        return "hello1";
//    }
//
//
//    @ApiOperation(value = "查询用户等级 参数：用户账号phoneNum 返回值：int")
//    @RequestMapping("/selectUserLevel")
//    public String selectUserLevel(Account account){
//
//
//        return "hello1";
//    }
//
//    @ApiOperation(value = "账户充值  参数：用户账号phoneNum 返回值：int")
//    @RequestMapping("/updateAccountMoney")
//    public String updateAccountMoney(Account account, @ApiParam("充值金额")int money){
//
//
//        return "hello1";
//    }
//    @ApiOperation(value = " 查询账户所有状态的订单  返回值：int")
//    @RequestMapping("/selectAllOrder")
//    public Order selectAllOrder(@ApiParam("用户手机号") int phoneNum,@ApiParam("订单状态") int status){
//
//
//        return new Order();
//    }
//    @ApiOperation(value = " 查询账户消息列表  返回值：int")
//    @RequestMapping("/selectAllMsgById")
//    public Message selectAllMsgById(@ApiParam("用户手机号") int phoneNum){
//
//
//        return new Message();
//    }
//    @ApiOperation(value = " 更新地址信息  返回值：true false")
//    @RequestMapping("/updateAddress")
//    public Boolean updateAddress( @ApiParam("用户手机号") int phoneNum,
//                                      @ApiParam("地址特征 家庭（family）or公司（company）") int type,
//                                      @ApiParam("地址信息")String mapPoint
//                                     ){
//
//
//        return true;
//    }
//
//    @ApiOperation(value = " 展示地址信息  返回值：Address(用户ID,地址特征,地址信息,用户手机号)")
//    @RequestMapping("/showAddress")
//    public Address showAddress(@ApiParam("用户手机号") int phoneNum){
//
//
//        return new Address();
//    }
//    @ApiOperation(value = "修改手机号   返回值：true false")
//    @RequestMapping("/updatePhoneNumById")
//    public Boolean updatePhoneNumById(@ApiParam("用户旧手机号") int phoneNum,@ApiParam("新手机号")int newPhoneNum){
//
//
//        return true;
//    }
//
//
//    @ApiOperation(value = "修改密码   返回值：true false")
//    @RequestMapping("/updatePasswordById")
//    public Boolean updatePasswordById(@ApiParam("用户手机号") int phoneNum,@ApiParam("密码")int password){
//
//
//        return true;
//    }
//
//    @ApiOperation(value = "新增代收货款账户   返回值：true false")
//    @RequestMapping("/insertCollectionAccount")
//    public Boolean insertCollectionAccount(@ApiParam("用户手机号") int phoneNum,@ApiParam("新账户") String collectionAccount){
//
//
//        return  true;
//    }
//
//
//    @ApiOperation(value = "展示代收货款账户   返回值：CollectionAccount(代收账户账户名，代收账户账户)")
//    @RequestMapping("/showCollectionAccount")
//    public String showCollectionAccount(@ApiParam("用户ID")int id){
//
//
//        return "collectionAccount";
//    }
//
//    @ApiOperation(value = "退出账户  返回值  true false")
//    @RequestMapping("/loginOut")
//    public Boolean loginOut(@ApiParam("用户ID")int id){
//
//
//        return false;
//    }
//
//
//    @ApiOperation(value = "展示用户优惠券  返回值 json字符串")
//    @RequestMapping("/selectAllCouponById")
//    public List<Ticket> selectAllCouponById(@ApiParam("用户ID")int id){
//
//
//        return null;
//    }
//
//    @ApiOperation(value = "帮帮帮订单 参数：" +
//            "简介，时间，位置，需求，优惠券，价格" +
//            "返回值 true false")
//    @RequestMapping("/helpOrder")
//    public Boolean helpOrder(Order order){
//
//
//        return true;
//    }
//
//    @ApiOperation(value = "帮帮买订单 参数：" +
//            "购买物品，开始地址，结束地址，路程，时间，优惠券" +
//            "返回值 int 金额")
//    @RequestMapping("/helpBuy")
//    public int helpBuy(Order order){
//
//
//        return 0;
//    }
//
//    @ApiOperation(value = "帮帮送订单 参数：" +
//            "开始地址，结束地址，路程，时间，时间设置，规格" +
//            "返回值 int 金额")
//    @RequestMapping("/helpGive")
//    public int helpGive(Order order){
//
//        return 0;
//    }
//
//    @ApiOperation(value = "帮帮取订单 参数：" +
//            "开始地址，结束地址，路程，时间，时间设置，规格" +
//            "返回值 int 金额")
//    @RequestMapping("/helpGet")
//    public int helpGet(Order order){
//
//        return 0;
//    }
//
//
//    @ApiOperation(value = "帮帮排队订单 参数：" +
//            "排队类型，叙述，位置，目的，时长" +
//            "返回值 int 金额")
//    @RequestMapping("/helLineup")
//    public int  helLineup(Order order){
//
//        return 0;
//    }
//
//
//
//
//
//
//
//
//
//}
