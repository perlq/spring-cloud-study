package com.kakj.springcloud.service;

import com.kakj.springcloud.entities.CommonResult;
import com.kakj.springcloud.entities.PayMent;

public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<PayMent> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，------------PaymentFallbackService",new PayMent(id,"errorSerial"));
    }
}
