package com.guircai.design.creational.factory.abstractfactory;

/**
 * 五菱口罩集团
 */
public abstract class WuLingMaskFactory extends WuLingFactory{

    @Override
    public AbstractCar newCar() {
        return null;
    }

    public abstract AbstractMask newMask();
}
