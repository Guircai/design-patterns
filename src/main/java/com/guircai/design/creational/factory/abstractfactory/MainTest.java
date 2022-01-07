package com.guircai.design.creational.factory.abstractfactory;

/**
 * 抽象工厂模式
 */
public class MainTest {
    public static void main(String[] args) {
        WuLingWuHanMaskFactory wuHanMaskFactory = new WuLingWuHanMaskFactory();
        AbstractMask newMask1 = wuHanMaskFactory.newMask();
        newMask1.protect();

        WuLingHangZhouMaskFactory wuLingHangZhouMaskFactory = new WuLingHangZhouMaskFactory();
        AbstractMask newMask2 = wuLingHangZhouMaskFactory.newMask();
        newMask2.protect();
    }
}
