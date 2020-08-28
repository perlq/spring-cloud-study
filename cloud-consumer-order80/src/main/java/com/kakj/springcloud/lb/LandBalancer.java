package com.kakj.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;


public interface LandBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
