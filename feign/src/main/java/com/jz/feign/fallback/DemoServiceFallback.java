package com.jz.feign.fallback;

import com.jz.bean.User;
import com.jz.feign.service.DemoFeignService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jiangzhuang on 2018/12/6.
 */
@Component
public class DemoServiceFallback implements DemoFeignService {

    @Override
    public String test(@RequestParam(value = "test") String test) {
        return " error test  ";
    }


    @Override
    public User user(@RequestBody User user) {
        return new User("error", -1);
    }
}
