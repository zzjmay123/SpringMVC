package com.springapp.mvc;

/**
 * Created by zhouzhenjiang on 2016/6/26.
 */
public class Work extends  Thread {

    private Queryesc querySvc;
    private String sql;

    public Work(Queryesc querySvc,String sql) {
        this.querySvc = querySvc;
        this.sql = sql;

    }

    public void run() {
        querySvc.setSql(sql);
        querySvc.execute();
    }
}
