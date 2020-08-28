package com.kakj.springcloud.dao;

import com.kakj.springcloud.entities.PayMent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PayMentDao {
    public int create(PayMent payMent);

    public PayMent getPayMentByid(@Param("id") long id);
}
