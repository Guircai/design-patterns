package com.guircai.design.behavioral.state;

/**
 * 旅游状态
 */
public class MatchState implements TeamState{

    @Override
    public void playGame() {
        System.out.println("三亚旅游，好饿，不想打游戏。。。");        
    }

    @Override
    public TeamState next() {
        return new BeafNodleState();
    }
}
