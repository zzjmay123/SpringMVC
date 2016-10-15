package com.springapp.thread;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhouzhenjiang on 2016/10/15.
 */
public class TestExchange {


    private static Exchanger<String> exchanger = new Exchanger<String>();

    private static ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                String A = "dddddddddddddddddddddddddddddddd";
                try {
                    exchanger.exchange(A);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                String B = "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr";
                try {
                    String A = exchanger.exchange(B);
                    System.out.println("交换数据  是否一致："+A.equals(B)+"A 录入的"+A+"，B录入的："+B);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
    }

}
