package com.springapp.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 实现运动员同一时刻开始踢球，比赛结束在所有球员结束后
 * Created by zhouzhenjiang on 2016/9/27.
 */
public class TestCountDownBatch {
    private static final int PLAYER_AMOUNT = 5;

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch begin = new CountDownLatch(1);

        CountDownLatch end = new CountDownLatch(PLAYER_AMOUNT);

        Player[] players = new Player[PLAYER_AMOUNT];

        for(int i=0;i<5;i++){
            players[i] = new Player(i,begin,end);  //实例化对象
        }

        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(PLAYER_AMOUNT);

        for(int i=0;i<5;i++){
            executorService.execute(players[i]);
        }

        //游戏开始了
        System.out.println("游戏开始了");

        begin.countDown();

        System.out.println("游戏进行中");

        end.await();

        System.out.println("游戏结束了");

        executorService.shutdown();
    }





}
