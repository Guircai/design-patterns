package com.guircai.design.behavioral.visitor;

/**
 * Disk
 */
public class Disk extends HardWare{

    public Disk(String command) {
        super(command);
    }

    @Override
    public void work() {
        System.out.println("Disk处理指令：" + command);
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.visitDisk(this);        
    }
}
