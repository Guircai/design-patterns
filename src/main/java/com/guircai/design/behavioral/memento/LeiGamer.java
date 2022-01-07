package com.guircai.design.behavioral.memento;

import java.util.Random;

import org.apache.commons.beanutils.BeanUtils;

import lombok.Data;

@Data
public class LeiGamer {
    // 以下的是内部状态，我们需要记录保存的信息
    Integer coin; // 剩余金币
    Integer hp; // 血量
    Integer mp; // 蓝量
    Integer level; // 等级

    GameServer gameServer = new GameServer();

    // 保存游戏记录
    void saveGameRecord() throws Exception {
        System.out.println("正在保存当前记录waiting...");
        GameRecord gameRecord = new GameRecord();
        // 当前游戏信息保存到备忘录
        BeanUtils.copyProperties(gameRecord, this);

        gameServer.add(gameRecord);
    }

    // 从备忘录获取游戏历史存档
    LeiGamer getFromMemento(Integer id) throws Exception {
        System.out.println("获取历史存档信息。。。");
        LeiGamer record = gameServer.getRecord(id);
        return record;
    }

    // 玩游戏
    void playGame() {
        System.out.println("..........(*^_^*)..........");
        int i = new Random().nextInt();
        coin = i;
        hp = i;
        mp = i;
        level = i;
    }

    // 退出游戏
    void exitGame() throws Exception {
        System.out.println("退出&存档");
        saveGameRecord();
    }
}
