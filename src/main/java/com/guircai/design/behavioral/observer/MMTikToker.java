package com.guircai.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主播
 */
public class MMTikToker extends AbstractTikToker{

    // 粉丝列表
    private List<AbstractFans> fansList = new ArrayList<>();

    public void startSell() {
        System.out.println("雷丰阳。。。开始卖货。。。源码设计课");
        notifyFans("我开始卖东西了，是源码设计课，只要666");
    }

    public void endSell() {
        System.out.println("雷丰阳。。。结束卖货。。。源码设计课");
        notifyFans("课已经卖完了");
    }

    @Override
    public void addFans(AbstractFans fans) {
        fansList.add(fans);
    }

    @Override
    public void notifyFans(String msg) {
        // 所有粉丝拿来通知
        for (AbstractFans fans : fansList) {
            fans.acceptMsg(msg);
        }
    }
}
