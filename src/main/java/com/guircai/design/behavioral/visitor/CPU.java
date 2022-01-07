package com.guircai.design.behavioral.visitor;

/**
 * CPU
 */
public class CPU extends HardWare{

    public CPU(String command) {
        super(command);
    }

    @Override
    public void work() {
        System.out.println("CPU处理指令：" + command);
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.visitCPU(this);        
    }
}
