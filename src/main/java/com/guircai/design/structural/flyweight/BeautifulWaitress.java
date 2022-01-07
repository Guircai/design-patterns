package com.guircai.design.structural.flyweight;

import lombok.AllArgsConstructor;

/**
 * 服务员
 */
@AllArgsConstructor
public class BeautifulWaitress extends AbstractWaitressFlyweight{

    // 以下是不变的
    public String id; // 工号
    public String name; // 名字
    public int age; // 年龄

    @Override
    void service() {
        System.out.println("工号：" + id + "姓名：" + name + "年龄：" + age + "正在为您服务。。。");
        canService = false;
    }

    @Override
    void end() {
        System.out.println("工号：" + id + "姓名：" + name + "年龄：" + age + "服务结束，记得五星好评。。。");
        canService = true;
    }
    
}
