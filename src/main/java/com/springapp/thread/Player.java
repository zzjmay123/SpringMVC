package com.springapp.thread;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

/**
 * Created by zhouzhenjiang on 2016/9/27.
 */
public class Player implements Runnable {
    private int id;//球员ID

    private CountDownLatch begin;

    private CountDownLatch end;

    public Player(int id, CountDownLatch begin, CountDownLatch end) {
        this.id = id;
        this.begin = begin;
        this.end = end;
    }

    public Player() {
    }

    @Override
    public void run() {

        try {
            begin.await();//等待begin为0表示开始，阻塞当前线程

            Thread.sleep((long) Math.random()*100); //随机睡觉，表示运动员运动时长

            System.out.println("Player"+id+"is end");



        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            end.countDown();  //每个球员结束才减1  知道end为0
        }
    }
}
