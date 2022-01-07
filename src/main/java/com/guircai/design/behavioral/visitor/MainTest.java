package com.guircai.design.behavioral.visitor;

/**
 * 访问者模式
 */
public class MainTest {
    public static void main(String[] args) {
        XiaoAi xiaoAi = new XiaoAi();

        xiaoAi.answerQueestion();

        // 升级 cpu联网处理指令
        // 升级 disk保存到云存储
        UpdatePackage updatePackage = new UpdatePackage("联网增强功能");
        xiaoAi.acceptUpdate(updatePackage);

        // 访问者模式
        xiaoAi.answerQueestion();
    }    
}
