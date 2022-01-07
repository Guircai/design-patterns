package com.guircai.design.behavioral.mediator;

/**
 * 香港XG9527
 */
public class XG95277 extends Captain{

    ControlTower controlTower;

    public void setControlTower(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    void fly() {
        System.out.println("XG95277请求起飞。。。");
        controlTower.acceptRequest(this, "fly");
    }

    @Override
    void land() {
        System.out.println("XG95277请求降落。。。");
        controlTower.acceptRequest(this, "land");
        
    }

    @Override
    void success() {
        System.out.println("XG95277完成。。。");
        controlTower.acceptRequest(this, "success");
        
    }
}
