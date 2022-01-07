package com.guircai.design.structural.decorator;

/**
 * 美颜装饰器
 *  装饰谁？
 * 
 * 装饰器只关心增强这个类的方法
 */
public class MeiYanDecorator implements TiktokDecorator{

    // private Farmework farmework; 适配器
    private ManTikTok manTikTok;
    
    public MeiYanDecorator(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    public void tiktok() {
        // 开启美颜
        enable();

        // farmework.enableMeiYan();

        // 开启直播
        manTikTok.tiktok();
    }

    /**
     * 定义的增强功能
     */
    public void enable() {
        System.out.println("看到这个美女.....");
        System.out.println("花花花花花花花花花花花花");
    }
}
