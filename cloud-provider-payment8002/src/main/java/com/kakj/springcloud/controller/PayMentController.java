package com.kakj.springcloud.controller;

import com.kakj.springcloud.entities.CommonResult;
import com.kakj.springcloud.entities.PayMent;
import com.kakj.springcloud.service.PayMentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PayMentController {
    @Resource
    private PayMentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value="/payment/create")
    public CommonResult create(@RequestBody PayMent payment) {
        int result = paymentService.create(payment);
        log.info("****插入结果:" + result);

        if(result > 0){
            return  new CommonResult(200,"插入数据库成功 serverPort: "+serverPort,result);
        } else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value="/payment/get/{id}")
    public CommonResult<PayMent> getPaymentById(@PathVariable("id") long id) {
        PayMent payment = paymentService.getPayMentByid(id);
        log.info("****查询结果:" + payment);

        if(payment != null){
            return  new CommonResult(200,"查询成功 serverPort: "+serverPort ,payment);
        } else {
            return new CommonResult(444,"没有对应记录，查询ID: " + id,null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public  String getPayMentlb(){
        return  serverPort;
    }
}
