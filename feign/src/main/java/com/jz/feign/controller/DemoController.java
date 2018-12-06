package com.jz.feign.controller;

import com.jz.bean.User;
import com.jz.feign.service.DemoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangzhuang on 2018/12/6.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    public DemoFeignService demoFeignService;

    @RequestMapping("/test")
    public String test(){
        return demoFeignService.test("test");
    }


    @RequestMapping("/user")
    public User user(){
        User user = new User("jz", 28);
        return demoFeignService.user(user);
    }

    @RequestMapping("/test1")
    public User test1(){
        return new User("jz", 28);
    }

}
