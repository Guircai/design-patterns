package com.guircai.design.structural.bridge;

public class MainTest {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.setSale(new OfflineSale("线下", 9999));

        String phone = iPhone.getPhone();
        System.out.println(phone);
    }
}
