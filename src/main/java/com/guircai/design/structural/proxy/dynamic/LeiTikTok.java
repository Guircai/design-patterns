package com.guircai.design.structural.proxy.dynamic;

public class LeiTikTok implements ManTikTok, SellTikTok{

    @Override
    public void sell() {
        System.out.println("TikTok...");
    }

    @Override
    public void tiktok() {
        System.out.println("Sell...");
    }

    public void haha() {
        System.out.println("哈哈....");
    }
}
