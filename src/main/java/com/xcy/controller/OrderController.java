package com.xcy.controller;

import com.xcy.pojo.*;
import com.xcy.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping({"/order"})
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
    @ApiOperation(value = "帮帮忙订单确认下单 参数：" +"HelpOrder实体类"+
            "简介，时间，位置，需求，价格, 账户id"+
            "返回值 成功：总订单的id 失败：0")
    @RequestMapping("/helpOrder")
    @ResponseBody
    public int helpOrder(HelpOrder helpOrder){
        helpOrder.setDescription("火龙");
        helpOrder.setMoney(22);
        helpOrder.setAccountId(1);
        Date date =new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String time = simpleDateFormat.format(date);
        helpOrder.setOtime(time);
        System.out.println("进入helpOrder");
       int a= orderService.submitHelpOrder(helpOrder);
       System.out.println(a);
       if (a>0){
           return helpOrder.getMoney();
       }else {
           return  0;
       }
}
    @ApiOperation(value = "帮忙买订单确认下单 参数：" +"HelpBuyOrder实体类"+
            "简介description，购买地址，收货地址，购买时间，优惠卷id, 商品价格，账户id"+
            "返回值 总订单的id")
    @RequestMapping("/buyOrder")
    @ResponseBody
    public int buyOrder(HelpBuyOrder helpBuyOrderOrder){

        helpBuyOrderOrder.setAccountId(1);
        Date date =new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String time = simpleDateFormat.format(date);
        helpBuyOrderOrder.setOtime(time);
        System.out.println("进入helpOrder");
        int a= orderService.submitHelpBuyOrder(helpBuyOrderOrder);
        System.out.println(a);
        if (a>0){
            return helpBuyOrderOrder.getOid();
        }else {
            return  0;
        }
    }
    @ApiOperation(value = "帮我送订单确认下单 参数：" +"HelpPutOrder实体类"+
            "取货地址，收货地址，取货时间，送到时间，描述, 费用，账户id"+
            "返回值 总订单的id")
    @RequestMapping("/putOrder")
    @ResponseBody
    public int putOrder(HelpPutOrder helpPutOrder){

        helpPutOrder.setAccountId(1);
        Date date =new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String time = simpleDateFormat.format(date);
        helpPutOrder.setOtime(time);
        System.out.println("进入helpOrder");
        int a= orderService.submitHelpPutOrder(helpPutOrder);
        System.out.println(a);
        if (a>0) {
            return helpPutOrder.getOid();
        }else {
            return  0;
        }
    }
    @ApiOperation(value = "帮我取订单确认下单 参数：" +"HelpGetOrder实体类"+
            "取货地址，收货地址，取货时间，收获时间时间，描述, 费用 账户id"+
            "返回值 总订单的id")
    @RequestMapping("/getOrder")
    @ResponseBody
    public int getOrder(HelpGetOrder helpGetOrder){

        helpGetOrder.setAccountId(1);
        Date date =new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String time = simpleDateFormat.format(date);
        helpGetOrder.setOtime(time);
        System.out.println("进入helpOrder");
        int a= orderService.submitHelpGetOrder(helpGetOrder);
        System.out.println(a);
        if (a>0) {
            return helpGetOrder.getOid();
        }else {
            return  0;
        }
    }
    @ApiOperation(value = "帮排队订单确认下单 参数：" +"HelpLineOrder实体类"+
            "简介，排队位置，目的，时长，价格, 账户id"+
            "返回值 总订单的id")
    @RequestMapping("/lineOrder")
    @ResponseBody
    public int lineOrder(HelpLineOrder helpLineOrder){

        helpLineOrder.setAccountId(1);
        Date date =new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String time = simpleDateFormat.format(date);
        helpLineOrder.setOtime(time);
        System.out.println("进入helpOrder");
        int a= orderService.submitHelpLineOrder(helpLineOrder);
        System.out.println(a);
        if (a>0) {
            return helpLineOrder.getOid();
        }else {
            return  0;
        }
    }

    @ApiOperation(value = "订单支付 参数：详细订单的id 0id 账户ID aid " +
            "返回值 int 1:支付成功 2：支付失败余额不足 3：发生异常支付失败")
    @RequestMapping("/payOrder")
    @ResponseBody
    public int payOrder(int oid,int aid){
        int a= orderService.payOrder(oid ,aid);
        return a;
    };
    @ApiOperation(value = "计算帮我送帮我取订单金额 参数：两地之间的距离 distance" +
            "返回值：money 帮我送订单配送费用")
    @RequestMapping("/payPut")
    @ResponseBody
    public int putMoney(int distance){
       if (distance<=10){
           return 15;
       }else {
           return 15+(distance-3)*3;
       }
    };
    @ApiOperation(value = "计算帮排队订单金额 参数：排队时长 time" +
            "返回值：money 帮我送订单配送费用")
    @RequestMapping("/payLine")
    @ResponseBody
    public int lineMoney(int time){
        if (time<=30){
            return 25;
        }else {
            return 25+(time-30)*2;
        }

    };

}
