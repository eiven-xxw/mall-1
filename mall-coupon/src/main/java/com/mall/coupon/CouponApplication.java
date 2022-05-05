package com.mall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author kylin
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponApplication.class,args);
    }
}