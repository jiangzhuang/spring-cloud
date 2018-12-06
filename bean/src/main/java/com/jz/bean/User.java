package com.jz.bean;

import java.io.Serializable;

/**
 * Created by jiangzhuang on 2018/12/6.
 */
public class User implements Serializable {

    private static final long serialVersionUID = -1L;

    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
