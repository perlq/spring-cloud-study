package com.kakj.springcloud.seata.controller;

import com.kakj.springcloud.seata.domain.CommonResult;
import com.kakj.springcloud.seata.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class AccountController {
    @Resource
    AccountService accountService;

    @RequestMapping(value = "/account/decrease",method = RequestMethod.POST)
    public CommonResult decrease(@RequestParam(value = "userId") Long userId, @RequestParam(value = "money")BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功");
    }
}
