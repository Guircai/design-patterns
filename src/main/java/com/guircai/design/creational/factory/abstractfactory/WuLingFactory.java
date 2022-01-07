package com.guircai.design.creational.factory.abstractfactory;

import java.util.List;

/**
 * 总厂规范：
 * 五菱集团
 * 
 * 使用接口
 */
public abstract class WuLingFactory {

    List<String> rules;

    public abstract AbstractCar newCar();
    public abstract AbstractMask newMask();
}
