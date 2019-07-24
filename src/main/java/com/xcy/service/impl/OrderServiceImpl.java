package com.xcy.service.impl;

import com.xcy.mapper.OrderMapper;
import com.xcy.pojo.Order;
import com.xcy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    OrderMapper orderMapper;
    @Override
    public List<Order> selectAllOrder(Order order) {
        return orderMapper.selectAllOrder(order);
    }

    @Override
    public List<Order> selectUnpaidOrder(Order order) {
        return orderMapper.selectUnpaidOrder(order);
    }

    @Override
    public List<Order> selectWaitOrder(Order order) {
        return orderMapper.selectWaitOrder(order);
    }

    @Override
    public List<Order> selectUnderwayOrder(Order order) {
        return orderMapper.selectUnderwayOrder(order);
    }

    @Override
    public List<Order> selectPlaceOrder(Order order) {
        return orderMapper.selectPlaceOrder(order);
    }
}
import com.xcy.pojo.*;
import com.xcy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

   //提供提交帮帮忙订单的服务，在方法中调用mapper层插入详细订单与总订单

    @Override
    @Transactional
    public int submitHelpOrder(HelpOrder helpOrder) {
        Order order=helpOrder.getOrder();
       int a =orderMapper.submitOrder(order);
       int b=0;
       if(a>0) {
           helpOrder.setOid(order.getId());
            b = orderMapper.submitHelpOrder(helpOrder);
       }else {
           return 0;
       }
        return b;

    }
    /*
    进行订单的支付，参数 order中的id oid  账户中的ID aid
     */
    @Override
    @Transactional
    public int payOrder(int oid,int aid) {
        int a = orderMapper.updateOrderStatus(oid,2);
        int b=0;
        int payMoney =orderMapper.getPayMoney(oid);
        int accountMoney=orderMapper.getAccountMoney(aid);
        if (payMoney<accountMoney){
            b=orderMapper.delMoney(aid,payMoney);
        }else {
            return 2;
        }
       if (a>0&&b>0){
           return 1;
       }else {
           return 3;
       }


    }

    @Override
    @Transactional
    public int submitHelpBuyOrder(HelpBuyOrder helpBuyOrderOrder) {
        Order order=helpBuyOrderOrder.getOrder();
        int a =orderMapper.submitOrder(order);
        int b=0;
        if(a>0) {
            helpBuyOrderOrder.setOid(order.getId());
            b = orderMapper.submitHelpBuyOrder(helpBuyOrderOrder);
        }else {
            return 0;
        }
        return b;

    }

    @Override
    public int submitHelpPutOrder(HelpPutOrder helpPutOrder) {
        Order order=helpPutOrder.getOrder();
        int a =orderMapper.submitOrder(order);
        int b=0;
        if(a>0) {
            helpPutOrder.setOid(order.getId());
            b = orderMapper.submitHelpPutOrder(helpPutOrder);
        }else {
            return 0;
        }
        return b;

    }

    @Override
    public int submitHelpGetOrder(HelpGetOrder helpGetOrder) {
        Order order=helpGetOrder.getOrder();
        int a =orderMapper.submitOrder(order);
        int b=0;
        if(a>0) {
            helpGetOrder.setOid(order.getId());
            b = orderMapper.submitHelpGetOrder(helpGetOrder);
        }else {
            return 0;
        }
        return b;
    }

    @Override
    public int submitHelpLineOrder(HelpLineOrder helpLineOrder) {
        Order order=helpLineOrder.getOrder();
        int a =orderMapper.submitOrder(order);
        int b=0;
        if(a>0) {
            helpLineOrder.setOid(order.getId());
            b = orderMapper.submitHelLineOrder(helpLineOrder);
        }else {
            return 0;
        }
        return b;
    }
    }


