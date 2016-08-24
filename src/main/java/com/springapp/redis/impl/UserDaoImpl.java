package com.springapp.redis.impl;

import com.springapp.common.Constant;
import com.springapp.redis.User;
import com.springapp.redis.UserDao;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 数据操作层
 * Created by zhouzhenjiang on 2016/8/24.
 */
@Service
public class UserDaoImpl implements UserDao {


    @Resource
    protected  RedisTemplate<Serializable,Serializable> redisTemplate;

    @Override
    public void saveUser(User user) {
        //简单的字符串级别的set方法,设置超时时间
        redisTemplate.opsForValue().set(user.getId(),user, Constant.REDIS_EXPIRETIME, TimeUnit.MINUTES);
    }

    @Override
    public void saveMultiUsers(Map<String, User> userMap) {
        redisTemplate.opsForValue().multiSet(userMap);
    }

    @Override
    public String getUserName(String id) {
        return (String) redisTemplate.opsForValue().get(id);
    }

    @Override
    public User getUser(String id) {
        return (User) redisTemplate.opsForValue().get(id);
    }

    @Override
    public List<Serializable> getMultiUsers(Collection<Serializable> keys) {
        return redisTemplate.opsForValue().multiGet(keys);
    }


}
