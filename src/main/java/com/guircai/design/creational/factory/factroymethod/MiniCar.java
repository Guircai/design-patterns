package com.guircai.design.creational.factory.factroymethod;

public class MiniCar extends AbstractCar{
    public MiniCar() {
        this.engine = "A发动机";
    }

    @Override
    public void run() {
        System.out.println(engine + "-->嗒嗒嗒!!!");
    }
}

 