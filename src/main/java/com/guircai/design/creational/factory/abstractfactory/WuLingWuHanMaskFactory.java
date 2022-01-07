package com.guircai.design.creational.factory.abstractfactory;

/**
 * 口罩分厂：N95Mask
 */
public class WuLingWuHanMaskFactory extends WuLingMaskFactory{

    @Override
    public AbstractMask newMask() {
        return new N95Mask();
    }
}
