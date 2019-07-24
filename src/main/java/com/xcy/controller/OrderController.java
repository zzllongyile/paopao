package com.xcy.controller;


import com.xcy.pojo.Order;
import com.xcy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/selectAllOrder")
    @ResponseBody
    public List<Order> selectAllOrder(Order order){
       List<Order>  orderList = orderService.selectAllOrder(order);
       return orderList;
    }
    //待付款
    @RequestMapping("/selectUnpaidOrder")
    @ResponseBody
    public List<Order> selectUnpaidOrder(Order order){
        List<Order>  orderList = orderService.selectUnpaidOrder(order);
        return orderList;
    }
    //待结单
    @RequestMapping("/selectWaitOrder")
    @ResponseBody
    public List<Order> selectWaitOrder(Order order){
        List<Order>  orderList = orderService.selectWaitOrder(order);
        return orderList;
    }
    //进行中
    @RequestMapping("/selectUnderwayOrder")
    @ResponseBody
    public List<Order> selectUnderwayOrder(Order order){
        List<Order>  orderList = orderService.selectUnderwayOrder(order);
        return orderList;
    }
    //待收货
    @RequestMapping("/selectPlaceOrder")
    @ResponseBody
    public List<Order> selectPlaceOrder(Order order){
        List<Order>  orderList = orderService.selectPlaceOrder(order);
        return orderList;
    }

}
