package com.springapp.thread;

import java.util.concurrent.TimeUnit;

/**
 * 这个程序达到的效果：
 *
 *  只有当主线程结束后，才能执行0,0结束执行1以此类推
 *  所以在主线程全部创建完了线程后，所有的线程会按顺序执行
 * Created by zhouzhenjiang on 2016/8/30.
 */
public class Join {

    public static void main(String[] args) throws Exception {
        Thread prethread = Thread.currentThread();

        for(int i=0;i<10;i++){
            Thread thread = new Thread(new Demot(prethread),String.valueOf(i));
            thread.start();
            prethread =thread; //用来没后一个线程是前一个的线程
        }
        TimeUnit.SECONDS.sleep(5);
        System.out.println(Thread.currentThread().getName()+",terminal");
    }

    static class Demot implements  Runnable{
        private Thread thread;

        public Demot(Thread thread) {
            this.thread = thread;
        }

        public Demot() {
        }

        @Override
        public void run() {

            try{
                this.thread.join();
            }catch (Exception e){
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+",terminal");

        }
    }
}
