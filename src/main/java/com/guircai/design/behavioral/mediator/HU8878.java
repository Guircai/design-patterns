package com.guircai.design.behavioral.mediator;

/**
 * 海南HU8878机组
 */
public class HU8878 extends Captain{

    ControlTower controlTower;

    public void setControlTower(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    void fly() {
        System.out.println("HU8878请求起飞。。。");
        controlTower.acceptRequest(this, "fly");
    }

    @Override
    void land() {
        System.out.println("HU8878请求降落。。。");
        controlTower.acceptRequest(this, "land");
    }

    @Override
    void success() {
        System.out.println("HU8878完成。。。");
        controlTower.acceptRequest(this, "success");
    }
}
