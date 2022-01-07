package com.guircai.design.creational.factory.abstractfactory;

/**
 * 口罩分厂：CommonMak
 */
public class WuLingHangZhouMaskFactory extends WuLingMaskFactory{

    @Override
    public AbstractMask newMask() {
        return new CommonMask();         
    }
}
