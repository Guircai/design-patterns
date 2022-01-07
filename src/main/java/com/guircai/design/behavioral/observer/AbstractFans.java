package com.guircai.design.behavioral.observer;

import java.util.List;

/**
 * 抽象观察者
 */
public abstract class AbstractFans {
    
    List<AbstractTikToker> tikTokers; // 双向观察

    // 接收主播消息
    public abstract void acceptMsg(String msg);

    // 关注主播
    void follow(AbstractTikToker tikToker) {
        // 主播增粉了
        tikToker.addFans(this);
        // for (AbstractTikToker toker : tikTokers) {
            
        // }
    }
}
