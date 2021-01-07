package com.kakj.springcloud.seata.service.impl;

import com.kakj.springcloud.seata.dao.AccountDao;
import com.kakj.springcloud.seata.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------>account-service中扣减账户余额开始");
        //模拟超时异常，全局事务回滚
        accountDao.decrease(userId,money);
        LOGGER.info("------>account-service中扣减账户余额结束");
    }
}
