package com.guircai.design.behavioral.state;

/**
 * 全力以赴状态
 */
public class VocationState implements TeamState{

    @Override
    public void playGame() {
        System.out.println("全力以赴。赢得比赛。。。");        
    }

    @Override
    public TeamState next() {
        return new MatchState();
    }
}
