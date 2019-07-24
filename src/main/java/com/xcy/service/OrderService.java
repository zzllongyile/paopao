package com.xcy.service;

import com.xcy.pojo.Order;

import java.util.List;

public interface OrderService {

    List<Order> selectAllOrder(Order order);

    List<Order> selectUnpaidOrder(Order order);

    List<Order> selectWaitOrder(Order order);

    List<Order> selectUnderwayOrder(Order order);

    List<Order> selectPlaceOrder(Order order);

}
