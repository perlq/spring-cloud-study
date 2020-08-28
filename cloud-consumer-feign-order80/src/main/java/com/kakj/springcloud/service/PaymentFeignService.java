package com.kakj.springcloud.service;

import com.kakj.springcloud.entities.CommonResult;
import com.kakj.springcloud.entities.PayMent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "SPRINGCLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value="/payment/get/{id}")
    CommonResult<PayMent> getPaymentById(@PathVariable("id") long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();

}
