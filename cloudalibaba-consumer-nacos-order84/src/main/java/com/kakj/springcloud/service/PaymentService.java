package com.kakj.springcloud.service;

import com.kakj.springcloud.entities.CommonResult;
import com.kakj.springcloud.entities.PayMent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping("/paymentSQL/{id}")
    public CommonResult<PayMent> paymentSQL(@PathVariable("id") Long id);
}
