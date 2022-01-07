package com.guircai.design.creational.factory.factroymethod;

/**
 * 五菱VanCar工厂
 */
public class WuLingVanCarFactory extends AbstractCarFactory{

    @Override
    public AbstractCar newCar() {
        return new VanCar();
    }
}
