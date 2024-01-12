package com.atguigu.cloud.serivce.impl;

import com.atguigu.cloud.mapper.AccountMapper;
import com.atguigu.cloud.serivce.AccountService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @auther zzyy
 * @create 2024-01-06 16:15
 */

@Service
@Slf4j
public class AccountServiceImpl implements AccountService
{
    @Resource
    AccountMapper accountMapper;

    /**
     * 扣减账户余额
     */
    @Override
    public void decrease(Long userId, Long money)
    {
        log.info("------->account-service中扣减账户余额开始");

        accountMapper.decrease(userId,money);

        //myTimeOut();
        //int age = 10/0;
        log.info("------->account-service中扣减账户余额结束");
    }

    /**
     * 模拟超时异常，全局事务回滚
     */
    private static void myTimeOut()
    {
        try { TimeUnit.SECONDS.sleep(65); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}



