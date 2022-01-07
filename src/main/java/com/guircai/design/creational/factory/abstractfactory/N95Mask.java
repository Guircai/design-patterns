package com.guircai.design.creational.factory.abstractfactory;

public class N95Mask extends AbstractMask{
    public N95Mask () {
        this.price = 2;
    }

    @Override
    public void protect() {
        System.out.println("保护指数95%");
    }
}
