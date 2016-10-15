package com.springapp.thread;

import java.util.concurrent.CountDownLatch;

/**
 * Created by zhouzhenjiang on 2016/10/15.
 */
public class Family implements Runnable {

    /**
     * 家人的姓名
     */
    private String name;

    /**
     * 吃饭计数器
     */
    private CountDownLatch eatIng;

    public Family(String name, CountDownLatch eatIng) {
        this.name = name;
        this.eatIng = eatIng;
    }

    @Override
    public void run() {

        try {
            /**
             * 不同的家庭成员休息的时间不一样
             */
            Thread.sleep((long) (Math.random()*100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是" + name);

        eatIng.countDown();

    }
}
