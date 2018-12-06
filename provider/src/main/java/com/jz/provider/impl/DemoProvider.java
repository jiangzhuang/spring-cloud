package com.jz.provider.impl;

import com.jz.api.IDemo;
import com.jz.bean.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangzhuang on 2018/12/6.
 */
@RestController
public class DemoProvider implements IDemo {

    @Override
    public String test(@RequestParam(value = "test") String test) {
        return "test :" + test;
    }


    @Override
    public User user(@RequestBody User user) {
        if(user == null){
            user = new User("test", 1);
        }
        return user;
    }
}
