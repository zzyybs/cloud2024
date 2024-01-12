package com.atguigu.cloud;

import java.time.ZonedDateTime;

/**
 * @auther zzyy
 * @create 2023-12-22 23:08
 */
public class Main
{
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
    }
}
