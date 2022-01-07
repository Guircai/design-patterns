package com.guircai.design.creational.factory.abstractfactory;

/**
 * 五菱汽车集团
 */
public abstract class WuLingCarFactory extends WuLingFactory{

    public abstract AbstractCar newCar();

    @Override
    public AbstractMask newMask() {
        return null;
    }
}
