package com.guircai.design.creational.factory.simplefactory;

/**
 * 简单工厂模式
 */
public class MainTest {
    public static void main(String[] args) {
        WuLingSimpleFactory factory = new WuLingSimpleFactory();

        AbstractCar van = factory.newCar("van");
        AbstractCar mini = factory.newCar("mini");
        AbstractCar zz = factory.newCar("zz");

        van.run();
        mini.run();
    }
}
