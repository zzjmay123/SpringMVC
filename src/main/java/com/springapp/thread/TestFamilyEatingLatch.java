package com.springapp.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * 使用java并发工具类实现家人同时吃饭的场景
 * Created by zhouzhenjiang on 2016/10/15.
 */
public class TestFamilyEatingLatch {

    public static  final int FAMILYCOUNT =3;

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch eating = new CountDownLatch(FAMILYCOUNT);

        Family baba = new Family("爸爸",eating);

        Family mami = new Family("妈妈",eating);

        Family didi = new Family("弟弟",eating);


        //创建线程池

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //启动线程池
        executorService.execute(baba);
        executorService.execute(mami);
        executorService.execute(didi);

        eating.await();//阻塞的吃饭的主线程，必须要要加上这段代码才能做到协作同步

        System.out.println("我们可以开饭了，人都到齐了");


    }

}
