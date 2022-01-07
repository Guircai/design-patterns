package com.guircai.design.behavioral.memento;

/**
 * 备忘录模式
 * 
 * 1. 备忘录的设计(提取属性)
 * 2. 备忘录对象和原对象的互转操作(BeanUtils属性的对拷)
 *      序列化
 *      保存数据库
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        
        LeiGamer leiGamer = new LeiGamer();
        leiGamer.playGame();

        // 第一次保存
        leiGamer.saveGameRecord();

        leiGamer.playGame();

        leiGamer.saveGameRecord();

        leiGamer.playGame();

        leiGamer.saveGameRecord();

        LeiGamer fromMemento = leiGamer.getFromMemento(3);

        fromMemento.playGame();
    }
}
