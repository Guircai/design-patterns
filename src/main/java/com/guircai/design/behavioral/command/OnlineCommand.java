package com.guircai.design.behavioral.command;

/**
 * 大厂学院直播上课命令
 * 
 * Controller {
 *     xxService
 *     aaService
 * }
 * 
 * 宏命令
 * order() {
 *     结账
 *     扣库存
 *     出账单
 *     ...
 * }
 */
public class OnlineCommand implements Command{

    private LeiReceiver leiReceiver = new LeiReceiver();

    @Override
    public void execute() {
        System.out.println("大厂学院直播....");
        leiReceiver.online();
    }
}
