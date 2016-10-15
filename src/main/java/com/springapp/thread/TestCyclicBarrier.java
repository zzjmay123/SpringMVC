package com.springapp.thread;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhouzhenjiang on 2016/10/15.
 */
public class TestCyclicBarrier {

    public static  final int STUDENT_COUNT =10;

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(STUDENT_COUNT, new Runnable() {
            @Override
            public void run() {
                System.out.println("全部成员到达，可以开始自己的答题了");
            }
        });

        Student[] students= new Student[10];

        for(int i =0 ;i<10;i++){
            Student student = new Student(i,cyclicBarrier);
            students[i] = student;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(Student student :students){
            executorService.execute(student);//启动十个线程
        }




    }

}
