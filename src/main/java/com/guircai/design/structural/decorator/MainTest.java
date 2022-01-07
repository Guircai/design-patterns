package com.guircai.design.structural.decorator;

/**
 * 装饰者模式
 */
public class MainTest {
    public static void main(String[] args) {
        // 被装饰对象
        ManTikTok manTikTok = new TikTok();

        MeiYanDecorator decorator = new MeiYanDecorator(manTikTok);
        decorator.tiktok();
    }
}
