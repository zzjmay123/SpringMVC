package com.springapp.thread;

import com.springapp.redis.User;

/**
 * Created by zhouzhenjiang on 2016/8/25.
 */
public class Test {

    public static void main(String[] args) {
//        Test test = new Test();

//        System.out.println("测试结果 t="+test.testUser().getName());

    }

    private int test(){
        int  m = 0;

        try{
            return m=2;
        }finally {
            m =1;
        }

    }

    private User testUser(){
        User user = new User();
        try{
            user.setName("zzjmay");
            return user;
        }finally {
            user.setName("周振江");
        }
    }
}
