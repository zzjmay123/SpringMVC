package com.springapp.redis;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by zhouzhenjiang on 2016/8/24.
 */
public interface UserDao {

    /**
     * 保存User
     * @param user
     */
     void saveUser(User user);

    /**
     * 批量存入值
     * @param userMap
     */
     void saveMultiUsers(Map<String,User> userMap);

    /**
     * 获取userName
     */
     String getUserName(String id);

    /**
     * 获取User
     * @param id
     * @return
     */
    User getUser(String id);

    List<Serializable> getMultiUsers(Collection<Serializable> keys);
}
