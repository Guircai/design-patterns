package com.guircai.design.behavioral.state;

/**
 * SKT战队(环境类)
 */
public class SKTTeam {
    
    private TeamState teamState;

    public void setTeamState(TeamState teamState) {
        this.teamState = teamState;
    }

    // 游戏开始
    public void startGame() {
        // 状态不同，会导致不同的游戏结果
        teamState.playGame();
    }

    public void next() {
        teamState = teamState.next();
    }
}
