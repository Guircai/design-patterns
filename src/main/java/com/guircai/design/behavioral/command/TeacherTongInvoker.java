package com.guircai.design.behavioral.command;

/**
 * 命令调用者，发起者
 */
public class TeacherTongInvoker {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void call() {
        command.execute();
    }
}
