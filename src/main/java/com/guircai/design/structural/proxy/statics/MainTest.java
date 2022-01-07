package com.guircai.design.structural.proxy.statics;

/**
 * 静态代理模式
 */
public class MainTest {
    public static void main(String[] args) {
        LiMingTiktokProxy liMingTiktokProxy = new LiMingTiktokProxy(new LeiTikTok());
        liMingTiktokProxy.tiktok();
    }
}
