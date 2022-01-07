package com.guircai.design.structural.flyweight;

/**
 * 享元模式
 */
public class MainTest {
    public static void main(String[] args) {
        // 1.我
        AbstractWaitressFlyweight waitress = ZuDao.getWaitress("");
        waitress.service();
        waitress.canService = true;
        System.out.println(waitress);

        // 2.阳哥
        AbstractWaitressFlyweight waitress1 = ZuDao.getWaitress("");
        waitress1.service();
        System.out.println(waitress1);

        // 2.康老师
        AbstractWaitressFlyweight waitress2 = ZuDao.getWaitress("9527");
        waitress2.service();
        System.out.println(waitress2);
    }
}
