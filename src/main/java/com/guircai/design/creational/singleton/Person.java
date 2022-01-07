package com.guircai.design.creational.singleton;

/**
 * 佟老师只能有一个
 */
public class Person {
    private String name;
    private int age;

    // 懒汉式
    private volatile static Person instance;
    // 饿汉式
    // private volatile static Person instance = new Person();

    // 构造器私有，外部不能实例化
    private Person() {
        System.out.println("创建了Person");
    }

    // 提供给外部的方法
    // 1. public static synchronized Person guiguBoss() 锁太大
    // 2. 双重检查锁+内存可见性(设计模式)
    public static Person GetGuiGuBoss() {
        // 如果没有再去创建
        if (instance == null) {
            synchronized(Person.class) {
                if (instance == null) {
                    Person person = new Person();
                    // 多线程问题
                    instance = person;
                }
            }
        }
        return instance;
    }
}
