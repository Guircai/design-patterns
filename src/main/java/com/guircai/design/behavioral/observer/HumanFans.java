package com.guircai.design.behavioral.observer;

/**
 * 真实粉丝类
 */
public class HumanFans extends AbstractFans{

    @Override
    public void acceptMsg(String msg) {
        System.out.println("主播说：" + msg);
    }
}
