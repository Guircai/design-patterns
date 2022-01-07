package com.guircai.design.creational.singleton;

import java.util.Map;
import java.util.Properties;

/**
 * 单例模式
 */
public final class MainTest {
    public static void main(String[] args) {
        Person person1 = Person.GetGuiGuBoss();
        Person person2 = Person.GetGuiGuBoss();

        System.out.println(person1 == person2);

        // 获取当前系统的属性
        Properties properties = System.getProperties();
        System.out.println(properties);

        System.out.println("===============================");

        // 获取当前系统环境变量
        Map<String, String> environment = System.getenv();
        System.out.println(environment);
    }
}
