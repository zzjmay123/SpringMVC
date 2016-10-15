package com.springapp.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by zhouzhenjiang on 2016/10/15.
 */
public class Student implements Runnable {

    private int id;

    /**
     * 同步屏障
     */
    private CyclicBarrier cyclicBarrier;

    public Student(int id, CyclicBarrier cyclicBarrier) {
        this.id = id;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {

        //到达屏障
        try {
            cyclicBarrier.await();

            System.out.println("到达屏障后 学生"+id+"开始答题");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
