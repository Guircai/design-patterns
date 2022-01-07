package com.guircai.design.creational.factory.factroymethod;

/**
 * 五菱MiniCar工厂
 */
public class WuLingMiniCarFactory extends AbstractCarFactory{

    @Override
    public AbstractCar newCar() {
        return new MiniCar();
    }
}
