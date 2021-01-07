package com.kakj.springcloud.seata.controller;


import com.kakj.springcloud.seata.domain.CommonResult;
import com.kakj.springcloud.seata.domain.Order;
import com.kakj.springcloud.seata.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

@RestController
public class OrderController{
       @Resource
       private OrderService orderService;




       @GetMapping("/order/create")
       public CommonResult create(Order order)
       {

           long i = 1;
           order.setId(++i);
           orderService.create(order);
               return new CommonResult(200,"订单创建成功");
        }

}
