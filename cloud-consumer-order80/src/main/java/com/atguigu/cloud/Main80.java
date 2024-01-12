package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther zzyy
 * @create 2023-12-22 22:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main80
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main80.class,args);
    }
}