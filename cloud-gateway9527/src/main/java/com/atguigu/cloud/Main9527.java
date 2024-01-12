package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther zzyy
 * @create 2023-12-28 22:17
 */
@SpringBootApplication
@EnableDiscoveryClient //服务注册和发现
public class Main9527
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main9527.class,args);
    }
}