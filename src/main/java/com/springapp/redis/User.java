package com.springapp.redis;

import java.io.Serializable;

/**
 * Created by zhouzhenjiang on 2016/8/24.
 */
public class User implements Serializable {

    private String id ;
    private String name;
    private String age;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
