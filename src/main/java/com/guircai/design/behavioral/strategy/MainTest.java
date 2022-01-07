package com.guircai.design.behavioral.strategy;

/**
 * 策略模式
 */
public class MainTest {
    public static void main(String[] args) {
        TeamGNR teamGNR = new TeamGNR();

        teamGNR.setGameStrategy(new RandomStrategy());
        teamGNR.startGame();
    }   
}
