package com.guircai.design.creational.factory.factroymethod;

/**
 * 四个角色
 * Product：抽象产品
 * ConcreteProduct：具体产品
 * Factory：抽象工厂
 * ConcreteFactory：具体工厂
 * 
 * 工厂方法模式
 * 缺点：系统复杂度增加，产品单一
 */
public class MainTest {
    public static void main(String[] args) {
        WuLingRacingCarFactory racingCarFactory = new WuLingRacingCarFactory();
        AbstractCar racingCar = racingCarFactory.newCar();
        racingCar.run();

        WuLingVanCarFactory vanCarFactory = new WuLingVanCarFactory();
        AbstractCar vanCar = vanCarFactory.newCar();
        vanCar.run();
    }
}
