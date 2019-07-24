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

}
