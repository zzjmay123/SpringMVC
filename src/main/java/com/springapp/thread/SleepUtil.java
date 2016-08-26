package com.springapp.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhouzhenjiang on 2016/8/25.
 */
public class SleepUtil {

    public static final void second(long seconds){
        try{
            TimeUnit.SECONDS.sleep(seconds);
        }catch (Exception e){

        }
    }
}
