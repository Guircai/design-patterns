package com.guircai.design.behavioral.mediator;

/**
 * 四川SC8633机组
 */
public class SC8633 extends Captain{

    ControlTower controlTower;

    public void setControlTower(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    void fly() {
        System.out.println("SC8633请求起飞。。。");
        controlTower.acceptRequest(this, "fly");
    }

    @Override
    void land() {
        System.out.println("SC8633请求降落。。。");
        controlTower.acceptRequest(this, "land");
    }

    @Override
    void success() {
        System.out.println("SC8633完成。。。");
        controlTower.acceptRequest(this, "success");
    }
}
