package com.guircai.design.creational.factory.abstractfactory;

public class VanCar extends AbstractCar{
    public VanCar () {
        this.engine = "B发动机";
    }

    @Override
    public void run() {
        System.out.println(engine + "-->轰轰轰!!!");
    }
}
