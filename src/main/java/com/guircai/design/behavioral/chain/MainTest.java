package com.guircai.design.behavioral.chain;

/**
 * 简单责任链模式
 * 
 * 1、链条的引用点
 * 2、下一个继续
 * 3、构造链条
 */
public class MainTest {
    public static void main(String[] args) {
        Teacher Leifengyang = new Teacher("Leifengyang");
        Teacher xiaokui = new Teacher("xiaokui");
        Teacher mengmeng = new Teacher("mengmeng");

        Leifengyang.setNext(xiaokui);
        xiaokui.setNext(mengmeng);

        Leifengyang.handleRequest();
    }
}
