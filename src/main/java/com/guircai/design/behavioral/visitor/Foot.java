package com.guircai.design.behavioral.visitor;

/**
 * Foot
 */
public class Foot extends HardWare{

    public Foot(String command) {
        super(command);
    }

    @Override
    public void work() {
        System.out.println("Foot处理指令：" + command);
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.visitFoot(this);        
    }
}
