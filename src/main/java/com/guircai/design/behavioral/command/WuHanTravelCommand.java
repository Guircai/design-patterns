package com.guircai.design.behavioral.command;

/**
 * 武汉出差命令
 */
public class WuHanTravelCommand implements Command{

    private LeiReceiver leiReceiver = new LeiReceiver();

    @Override
    public void execute() {
        System.out.println("需要人出差...");      
        leiReceiver.travel();  
    }
}
