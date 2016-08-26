package com.springapp.thread;

/**
 * 测试线程状态
 * Created by zhouzhenjiang on 2016/8/25.
 */
public class TestThreadStatus {

    public static void main(String[] args) {
        new Thread(new TimeWaiting(),"TimewaitingThread").start();
        new Thread(new Waiting(),"WaitingThread").start();
        new Thread(new Blocked(),"BlockedThread-1").start();
        new Thread(new Blocked(),"BlockedThread-2").start();
    }

    //一致睡眠
    static  class TimeWaiting implements  Runnable{

        @Override
        public void run() {
            while (true){
                SleepUtil.second(100);
            }
        }
    }
    //一致等待
    static class Waiting implements Runnable{

        @Override
        public void run() {
            while(true){
                synchronized (Waiting.class){
                    try{
                        Waiting.class.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Blocked implements Runnable{

        @Override
        public void run() {
            synchronized (Blocked.class){
                while(true){
                    SleepUtil.second(100);
                }
            }
        }
    }

}


