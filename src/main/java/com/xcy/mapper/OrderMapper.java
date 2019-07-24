package com.xcy.mapper;


import com.xcy.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> selectAllOrder(Order order);

    List<Order> selectUnpaidOrder(Order order);

    List<Order> selectWaitOrder(Order order);

    List<Order> selectUnderwayOrder(Order order);

    List<Order> selectPlaceOrder(Order order);

import com.xcy.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    int submitHelpOrder(HelpOrder helpOrder);//提交帮帮我订单

    int submitOrder(Order order);//提交总订单

    int updateOrderStatus(int oid, int status);//提交

    int delMoney(@Param("aid") int aid,@Param("money") int money);
    int getPayMoney(int id);//获取订单金额
     int getAccountMoney(int id);//获取账户余额

    int submitHelpBuyOrder(HelpBuyOrder helpBuyOrderOrder);

    int submitHelpPutOrder(HelpPutOrder helpPutOrder);

    int submitHelpGetOrder(HelpGetOrder helpGetOrder);

    int submitHelLineOrder(HelpLineOrder helpLineOrder);
}
