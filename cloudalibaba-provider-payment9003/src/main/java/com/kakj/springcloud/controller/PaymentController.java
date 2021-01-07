package com.kakj.springcloud.controller;

import com.kakj.springcloud.entities.CommonResult;
import com.kakj.springcloud.entities.PayMent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, PayMent> hashMap = new HashMap<>();
    static {
        hashMap.put(1L,new PayMent(1L,"28adsasadsafas5d1as5fad5as31d3as0"));
        hashMap.put(2L,new PayMent(2L,"4das5d5asda4dad5asda5s3dasd53das0"));
        hashMap.put(3L,new PayMent(3L,"6ads65d351as3d1as53d1a53d3as13as0"));
    }

    @GetMapping("/paymentSQL/{id}")
    public CommonResult<PayMent> paymentSQL(@PathVariable("id") Long id){
        PayMent payment = hashMap.get(id);
        CommonResult<PayMent> result = new CommonResult(200, "from mysql ,serverPort: " + serverPort,"");
        return result;
    }
}
