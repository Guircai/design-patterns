package com.guircai.design.creational.builder;

/**
 * 建造者模式
 */
public class MainTest {
    public static void main(String[] args) {

        AbstractBuilder aBuilder = new XiaoMiBuilder();

        // 建造这个手机
        aBuilder.customCam("1亿像素");
        aBuilder.customCpu("晓龙888");
        aBuilder.customDisk("1T");
        aBuilder.customMen("16G");
        Phone phone = aBuilder.product();

        // 链式建造者   Swagger
        Phone phone1 = aBuilder.customCam("2亿像素")
                .customCpu("晓龙888")
                .customDisk("1T")
                .customMen("16G")
                .product();

        // Lombok链式(@Builder)
        Phone phone2 = Phone.builder().cam("3亿像素").cpu("晓龙888").disk("1T").men("16G").build();

        System.out.println(phone);
        System.out.println(phone1);
        System.out.println(phone2);
    }
}
