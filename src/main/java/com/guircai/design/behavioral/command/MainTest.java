package com.guircai.design.behavioral.command;

/**
 * 命令模式
 */
public class MainTest {
    public static void main(String[] args) {
     TeacherTongInvoker invoker = new TeacherTongInvoker();
     
    //  invoker.setCommand(new WuHanTravelCommand());
     invoker.setCommand(new OnlineCommand());
     invoker.call();
    }
}
