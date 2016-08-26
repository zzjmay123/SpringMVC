package com.springapp.test;

import com.jd.payment.paycommon.utils.GsonUtils;
import com.springapp.redis.User;
import com.springapp.redis.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 测试redis程序
 * Created by zhouzhenjiang on 2016/8/24.
 */
@Controller
@RequestMapping("redis")
public class TestRedis {
    @Resource
    private UserDao userDao ;

    @RequestMapping("/test")
    public String redis(ModelMap model){

        User user = new User();
        user.setId("99");
        user.setAge("23");
        user.setName("zzjmay");

        userDao.saveUser(user);//存入

//        String username = userDao.getUserName("123");
//        model.addAttribute("username",username);


        User redisUser = userDao.getUser(user.getId());
        model.addAttribute("user",redisUser);

        return "redis";
    }

    @RequestMapping("/testMutli")
    public String redisMulti(ModelMap model){
        Map<String,User> map = new ConcurrentHashMap<String, User>();
        User user1 = new User();
        user1.setId("z1");
        user1.setName("周振江");
        user1.setAge("19");
        map.put(user1.getId(),user1);

        User user2 = new User();
        user2.setId("z2");
        user2.setName("周振江");
        user2.setAge("19");
        map.put(user2.getId(),user2);

        User user3 = new User();
        user3.setId("z3");
        user3.setName("周振江");
        user3.setAge("19");
        map.put(user3.getId(),user3);

        userDao.saveMultiUsers(map);

        Collection<Serializable> keys = new ArrayList<Serializable>();
        keys.add(user1.getId());
        keys.add(user2.getId());
        keys.add(user3.getId());
        List<Serializable> list = userDao.getMultiUsers(keys);

        System.out.println("输出的值有: list "+ GsonUtils.toJson(list));

        return "redis";
    }

}
