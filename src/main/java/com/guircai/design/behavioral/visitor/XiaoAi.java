package com.guircai.design.behavioral.visitor;

/**
 * 实体类
 * 
 * 小爱AI音箱
 */
public class XiaoAi {
    private CPU cpu = new CPU("武汉天气");
    private Disk disk = new Disk("武汉天气");

    public void answerQueestion() {
        cpu.work();
        disk.work();
    }

    public void acceptUpdate(Vistor aPackage) {
        // 升级
        // 访问模式
        aPackage.visitCPU(cpu);
        aPackage.visitDisk(disk);
    }
}
