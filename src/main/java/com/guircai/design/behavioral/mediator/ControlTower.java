package com.guircai.design.behavioral.mediator;

/**
 * 塔台：中介者
 */
public class ControlTower {
    
    private boolean canDo = true;

    // 接受请求。。。
    public void acceptRequest(Captain captain, String action) {
        if ("fly".equals(action) || "land".equals(action)) {
            if (canDo == true) {
                System.out.println("允许。。。");
                canDo = false;
            } else {
                System.out.println("不允许。。。");
            }
        }
        if ("success".equals(action)) {
            canDo = true;
        }
    }
}
