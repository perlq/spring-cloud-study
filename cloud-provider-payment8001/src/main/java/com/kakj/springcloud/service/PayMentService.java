package com.kakj.springcloud.service;

import com.kakj.springcloud.entities.PayMent;

public interface PayMentService {

    public int create(PayMent payMent);

    public PayMent getPayMentByid(long id);
}
