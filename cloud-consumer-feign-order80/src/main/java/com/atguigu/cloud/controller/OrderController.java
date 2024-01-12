package com.atguigu.cloud.controller;

import cn.hutool.core.date.DateUtil;
import com.atguigu.cloud.apis.PayFeignApi;
import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.resp.ReturnCodeEnum;
import jakarta.annotation.Resource;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import reactor.util.retry.Retry;

import java.util.List;

/**
 * @auther zzyy
 * @create 2023-12-22 22:33
 */
@RestController
public class OrderController
{
    @Resource
    private PayFeignApi payFeignApi;

    @PostMapping(value = "/feign/pay/add")
    public ResultData addOrder(@RequestBody PayDTO payDTO)
    {
        System.out.println("第一步：模拟本地addOrder新增订单成功(省略sql操作)，第二步：再开启addPay支付微服务远程调用");
        ResultData resultData = payFeignApi.addPay(payDTO);
        return resultData;
    }

    @GetMapping(value = "/feign/pay/get/{id}")
    public ResultData getPayInfo(@PathVariable("id") Integer id)
    {
        System.out.println("-------支付微服务远程调用，按照id查询订单支付流水信息");
        ResultData resultData = null;
        try
        {
            System.out.println("调用开始-----: "+ DateUtil.now());
            resultData = payFeignApi.getPayInfo(id);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("调用结束-----: "+ DateUtil.now());
            ResultData.fail(ReturnCodeEnum.RC500.getCode(),e.getMessage());
        }
        return resultData;
    }

    /** 操千曲而晓声，观千剑而后识器
     * openfeign天然支持负载均衡演示
     * @return
     */
    @GetMapping(value = "/feign/pay/mylb")
    public String mylb()
    {
        return payFeignApi.mylb();
    }

}