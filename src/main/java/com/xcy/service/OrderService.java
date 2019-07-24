package com.xcy.service;

import com.xcy.pojo.*;

import java.util.List;

public interface OrderService {

    List<Order> selectAllOrder(Order order);

    List<Order> selectUnpaidOrder(Order order);

    List<Order> selectWaitOrder(Order order);

    List<Order> selectUnderwayOrder(Order order);

    List<Order> selectPlaceOrder(Order order);


    int  submitHelpOrder(HelpOrder helpOrder);

    int payOrder(int oid, int aid);

    int submitHelpBuyOrder(HelpBuyOrder helpBuyOrder);

    int submitHelpPutOrder(HelpPutOrder helpPutOrder);

    int submitHelpGetOrder(HelpGetOrder helpGetOrder);

    int submitHelpLineOrder(HelpLineOrder helpLineOrder);
}
