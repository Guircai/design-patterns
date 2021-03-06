package com.guircai.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 足道店：这相当于享元工厂
 *        店里很多服务员
 * 
 * 享元和模型
 * 1. 享元返回的是这个本人
 * 2. 原型返回的是克隆人
 */
public class ZuDao {
    
    private static Map<String, AbstractWaitressFlyweight> pool = new HashMap<>();

    // 享元，池子中有对象
    static {
        BeautifulWaitress waitress = new BeautifulWaitress("1111", "张三", 18);
        BeautifulWaitress waitress2 = new BeautifulWaitress("9527", "李四", 20);

        pool.put(waitress.id, waitress);
        pool.put(waitress2.id, waitress2);
    }

    // 添加服务员
    public void addWaitress(AbstractWaitressFlyweight waitressFlyweight) {
        pool.put(UUID.randomUUID().toString(), waitressFlyweight);
    }

    // 分配服务员
    public static AbstractWaitressFlyweight getWaitress(String name) {
        AbstractWaitressFlyweight flyweight = pool.get(name);
        if (flyweight == null) {
            for (AbstractWaitressFlyweight value : pool.values()) {
                // 当前共享对象能否服务
                if (value.isCanService()) {
                    return value;
                }
            }
            return null;
        }
        return flyweight;
    }
}
