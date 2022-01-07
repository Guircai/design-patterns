package com.guircai.design.behavioral.state;

/**
 * 抽象状态
 */
public interface TeamState {
    
    void playGame();

    TeamState next();
}
