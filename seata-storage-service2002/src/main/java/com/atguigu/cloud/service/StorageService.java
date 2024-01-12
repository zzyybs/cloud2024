package com.atguigu.cloud.service;

/**
 * @auther zzyy
 * @create 2024-01-06 16:08
 */
public interface StorageService
{
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
