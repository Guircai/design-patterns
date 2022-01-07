package com.guircai.design.behavioral.visitor;

/**
 * 硬件     抽象元素类
 */
public abstract class HardWare {
    String command; // 封装硬件的处理指令

    public HardWare(String command) {
        this.command = command;
    }

    // 收到命令以后进行工作
    abstract public void work();

    // 定义接受软件升级包的方法，这个方法具体硬件去实现
    abstract public void accept(Vistor vistor);
}
