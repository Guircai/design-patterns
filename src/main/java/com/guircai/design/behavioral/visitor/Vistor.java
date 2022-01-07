package com.guircai.design.behavioral.visitor;

/**
 * 升级包接口
 */
public interface Vistor {
    
    void visitDisk(Disk disk);

    void visitCPU(CPU cpu);

    void visitFoot(Foot foot);
}
