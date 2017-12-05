package com.yingliu.dayu.orders.service;

import com.yingliu.dayu.orders.service.vo.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrdersQuery {
    List<Orders> queryOrders();

    Orders queryOrder(String id);
}
