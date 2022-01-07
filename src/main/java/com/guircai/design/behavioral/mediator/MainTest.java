package com.guircai.design.behavioral.mediator;

/**
 * 中介者模式
 */
public class MainTest {
    public static void main(String[] args) {
        XG95277 xg95277 = new XG95277();
        SC8633 sc8633 = new SC8633();
        ControlTower controlTower = new ControlTower();

        xg95277.setControlTower(controlTower);
        sc8633.setControlTower(controlTower);

        xg95277.fly();
        xg95277.success();
        sc8633.fly();
    }
}
