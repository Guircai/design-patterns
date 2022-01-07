package com.guircai.design.creational.factory.factroymethod;

/**
 * 五菱RacingCar工厂
 */
public class WuLingRacingCarFactory extends AbstractCarFactory{

    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
    
}
