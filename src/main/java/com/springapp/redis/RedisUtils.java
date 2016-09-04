package com.springapp.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

/**
 * redis工具类
 * Created by zzjmay on 16/9/4.
 */
public class RedisUtils {

    @Resource
    private JedisPool jedisPool;


    //redis客户端
    private static Jedis jedis;

    public RedisUtils() {
    }

    /**
     * 获取客户端连接
     * @return
     */
    private Jedis getJedis(){
        if(jedis == null){
            jedis = jedisPool.getResource();
        }

        return jedis;
    }

    /**
     * 删除对应的key
     * @param key
     */
    public void del(String key){
         this.getJedis().del(key);
    }

    /**
     * 添加key value
     * @param key
     * @param value
     * @return
     */
    public String add(String key,String value){
        return this.getJedis().set(key,value);
    }

    /**
     * 设置有过期时间的key
     * @param key
     * @param value
     * @param seconds
     * @return
     */
    public String addEX(String key,String value,int seconds){
        return  this.getJedis().setex(key,seconds,value);
    }

    /**
     * 获取对应的key值
     * @param key
     * @return
     */
    public String get(String key){
        return this.getJedis().get(key);
    }

    /**
     * 判断key值是否存在
     * @param key
     * @return
     */
    public boolean contains(String key){
        return this.getJedis().exists(key);
    }

    /**
     * 判断是否客户端连接成功
     * @return
     */
    public String ping(){
        return this.getJedis().ping();
    }

    /**
     * 统计总的redis的数据
     * @return
     */
    public long dbSize(){
        return this.getJedis().dbSize();
    }

    /**
     *计算key的过期时间
     * @param key
     * @return
     */
    public long ttl(String key){
        return this.getJedis().ttl(key);
    }


}
