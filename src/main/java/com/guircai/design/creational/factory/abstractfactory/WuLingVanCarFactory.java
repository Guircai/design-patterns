package com.guircai.design.creational.factory.abstractfactory;

/**
 * 汽车分厂：VanCar
 */
public class WuLingVanCarFactory extends WuLingCarFactory{

    @Override
    public AbstractCar newCar() {
        return new VanCar();
    }
}
