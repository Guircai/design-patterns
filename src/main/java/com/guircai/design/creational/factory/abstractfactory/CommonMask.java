package com.guircai.design.creational.factory.abstractfactory;

public class CommonMask extends AbstractMask{
    public CommonMask() {
        this.price = 1;
    }

    @Override
    public void protect() {
        System.out.println("保护指数90%");
    }
}
