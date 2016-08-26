package com.springapp.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * Created by zhouzhenjiang on 2016/8/25.
 */
public class TestThread {

    public static void main(String[] args) {
        //获取java线程管理器
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);

        for(ThreadInfo threadInfo:threadInfos){
            System.out.println("["+threadInfo.getThreadId()+"]  "+threadInfo.getThreadName());
        }
    }
}
