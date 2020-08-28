package com.kakj.springcloud.service.impl;

import com.kakj.springcloud.dao.PayMentDao;
import com.kakj.springcloud.entities.PayMent;
import com.kakj.springcloud.service.PayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayMentServiceImpl implements PayMentService {

    @Autowired
    private PayMentDao payMentDao;
    @Override
    public int create(PayMent payMent) {
        return payMentDao.create(payMent);
    }

    @Override
    public PayMent getPayMentByid(long id) {
        return payMentDao.getPayMentByid(id);
    }
}
