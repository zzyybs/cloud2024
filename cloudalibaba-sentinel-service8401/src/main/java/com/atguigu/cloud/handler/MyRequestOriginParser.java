package com.atguigu.cloud.handler;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2024-01-04 10:42
 */
@Component
public class MyRequestOriginParser implements RequestOriginParser
{
    @Override
    public String parseOrigin(HttpServletRequest request)
    {
        return request.getParameter("serverName");
    }
}