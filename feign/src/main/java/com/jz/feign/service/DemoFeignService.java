package com.jz.feign.service;

import com.jz.api.IDemo;
import com.jz.feign.fallback.DemoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by jiangzhuang on 2018/12/6.
 */
@FeignClient(name = "provider", fallback = DemoServiceFallback.class)
public interface DemoFeignService extends IDemo {
}
