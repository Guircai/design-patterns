package com.guircai.design.creational.factory.simplefactory;

/**
 * 简单工厂
 * 1. 产品数量极少
 */
public class WuLingSimpleFactory {
    /**
     * 
     * @param type Class: 好像具有拓展性，但是没有解决实际问题。
     * @return
     */
    public AbstractCar newCar(String type) {
        // 核心方法：一切从简
        if ("van".equals(type)) {
            return new VanCar();
        } else if ("mini".equals(type)) {
            return new MiniCar();
        }
        // ......
        
        // 更多的产品，违反开闭原则，应该直接拓展出一个类来造车。
        return null;
    }
}
