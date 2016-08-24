package com.springapp.mvc;

/**
 * Created by zhouzhenjiang on 2016/6/26.
 */
public class Queryesc {

    private String sql;

    private static  ThreadLocal threadLocal = new ThreadLocal();

    public Queryesc(){

    }

    public void execute(){
        System.out.println("Thread " + Thread.currentThread().getId() + " Sql  is " + sql);
        System.out.println("Thread " + Thread.currentThread().getId() + " Thread Local variable Sql is " + threadLocal.get());
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
        threadLocal.set(sql);
    }
}
