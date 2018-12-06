package com.jz.api;

import com.jz.bean.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jiangzhuang on 2018/12/6.
 */
public interface IDemo {

    /**
     * 入参为字段，返回值为字段
     */
    @RequestMapping(value="/demo-api/test", method=RequestMethod.GET)
    String test(@RequestParam(value = "test") String test);
    /**
     * 入参为对象，返回值为对象
     */
    @RequestMapping(value="/demo-api/user", method= RequestMethod.POST)
    User user(@RequestBody User user);

}
