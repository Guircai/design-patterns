package com.guircai.design.behavioral.template;

/**
 * 自动做饭机器
 */
public class AutoCookMachine extends CookTemplate{

    @Override
    public void addFood() {
        System.out.println("加三根小白菜。。。");        
    }

    @Override
    public void addSalt() {
        System.out.println("加一小勺盐。。。");        
    }
}
