package com.springapp.mvc;

/**
 *线程的ThreadLocal
 * Created by zhouzhenjiang on 2016/6/26.
 */
public class TestThread {

    public static void main(String[] args){
        Queryesc queryesc = new Queryesc();

        for(int i=1;i<10;i++){
            String sql = "Select * from table where id =" + i;
            new Work(queryesc,sql).start();
        }
    }
}
