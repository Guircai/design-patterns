package com.guircai.design.behavioral.template;

/**
 * 定义模板
 */
public abstract class CookTemplate {
    
    /**
     * 定义算法：定义好了模板
     */
    public void cook() {
        // 定义算法步骤
        heating();
        addFood();
        addSalt();
        stirfry();
        end();;
    }

    // 加热
    public void heating() {
        System.out.println("开火。。。");
    }

    // 添加食物
    public abstract void addFood();

    // 加盐
    public abstract void addSalt();

    // 翻炒
    public void stirfry() {
        System.out.println("翻炒中。。。");
    }

    // 结束
    public void end() {
        System.out.println("出锅。。。");
    }
}
