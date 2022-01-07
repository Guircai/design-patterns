package com.guircai.design.behavioral.state;

/**
 * 吃牛肉面状态
 */
public class BeafNodleState implements TeamState{

    @Override
    public void playGame() {
        System.out.println("吃了牛肉面，打输了比赛。。。");        
    }

    @Override
    public TeamState next() {
        return new VocationState();
    }
}
