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
