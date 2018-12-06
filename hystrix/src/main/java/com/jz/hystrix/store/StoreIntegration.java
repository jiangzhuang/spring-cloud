package com.jz.hystrix.store;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by jiangzhuang on 2018/12/6.
 */
@Component
public class StoreIntegration {

    @HystrixCommand(fallbackMethod = "defaultStores")
    public Object getStores(Map<String,Object> parameters){
        return null;
    }

    public Object defaultStores(Map<String, Object> parameters){
        return null;
    }
}
