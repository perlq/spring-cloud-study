package com.kakj.springcloud.seata.service;

import com.kakj.springcloud.seata.domain.Order;

public interface OrderService {
    void create(Order order);
}
