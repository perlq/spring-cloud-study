package com.kakj.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PayMentMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain9002.class,args);
    }
}
