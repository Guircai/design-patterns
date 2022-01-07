package com.guircai.design.structural.proxy.statics;

/**
 * 代理一般都是被代理对象属于一个接口
 */
public class LiMingTiktokProxy implements ManTikTok{

    private ManTikTok manTikTok; // 被代理对象
    
    public LiMingTiktokProxy(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    /**
     * 李明老师(代理)   雷丰阳老师(被代理对象)
     */
    @Override
    public void tiktok() {
        // 增强功能
        System.out.println("渲染直播间...");
        System.out.println("课程只要666,仅此一天...");
        manTikTok.tiktok();
    }
}
