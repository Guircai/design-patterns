package com.guircai.design.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class GuiguMyBatis {
    
    // 缓存user
    private Map<String, User> userCache = new HashMap<String, User>();

    public User getUser(String name) throws CloneNotSupportedException {
        User user = null;
        // 缓存中没有
        if (!userCache.containsKey(name)) {
            // 查询数据库
            user = getUserFromDb(name);
        } else {
            // 从缓存中直接拿，脏缓存问题
            // 原型已经拿到，但是不能直接给(本人)
            user = userCache.get(name);
            System.out.println("从缓存中拿到的");
            // 从这个对象快速得到一个克隆体(克隆人) == 原型模式
            user = (User) user.clone();
        }
        return user;
    }

    public User getUserFromDb(String name) throws CloneNotSupportedException {
        System.out.println("从数据库查到：" + name);
        User user = new User();
        user.setName(name);
        user.setAge(19);
        // 给缓存中放一个clone
        userCache.put(name, (User)user.clone());
        return user;
    }
}
