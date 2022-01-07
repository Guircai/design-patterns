package com.guircai.design.creational.factory.abstractfactory;

/**
 * 汽车分厂：RacingCar
 */
public class WuLingRacingCarFactory extends WuLingCarFactory{

    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}
