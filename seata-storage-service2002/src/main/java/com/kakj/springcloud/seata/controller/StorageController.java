package com.kakj.springcloud.seata.controller;

import com.kakj.springcloud.seata.domain.CommonResult;
import com.kakj.springcloud.seata.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    @RequestMapping(value = "/storage/decrease",method = RequestMethod.POST)
    public CommonResult decrease(Long productId, Integer count){
        storageService.decrease(productId,count);
        return new CommonResult(200,"扣减库存成功");
    }
}
