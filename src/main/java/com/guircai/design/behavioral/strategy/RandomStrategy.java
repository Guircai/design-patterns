package com.guircai.design.behavioral.strategy;

/**
 * 大乱斗运营策略
 */
public class RandomStrategy implements GameStrategy{

    @Override
    public void warStrategy() {
        System.out.println("大乱斗。。。");        
    }
}
