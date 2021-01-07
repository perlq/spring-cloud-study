package com.kakj.springcloud.seata.service;

import com.kakj.springcloud.seata.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-storage-service")
public interface StorageService {
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam(value = "productId") Long productId, @RequestParam(value = "count") Integer count);
}
