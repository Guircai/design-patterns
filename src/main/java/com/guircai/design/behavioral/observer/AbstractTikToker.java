package com.guircai.design.behavioral.observer;

/**
 * 抖音主播
 * 
 * 粉丝观察主播
 */
public abstract class AbstractTikToker {
    
    // 添加粉丝
    public abstract void addFans(AbstractFans fans);

    // 通知粉丝
    public abstract void notifyFans(String msg);
}
