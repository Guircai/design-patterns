package com.guircai.design.behavioral.state;

/**
 * 状态模式
 * 
 * 状态切换
 */
public class MainTest {
    public static void main(String[] args) {
        SKTTeam sktTeam = new SKTTeam();
        MatchState matchState = new MatchState();
        sktTeam.setTeamState(matchState);

        sktTeam.startGame();
        sktTeam.next();
        
        sktTeam.startGame();
        sktTeam.next();
        
        sktTeam.startGame();
        sktTeam.next();
    }
}
