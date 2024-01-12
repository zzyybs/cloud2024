package com.atguigu.cloud.serivce;

import org.apache.ibatis.annotations.Param;

/**
 * @auther zzyy
 * @create 2024-01-06 16:15
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 本次消费金额
     */
    void decrease(@Param("userId") Long userId, @Param("money") Long money);
}
