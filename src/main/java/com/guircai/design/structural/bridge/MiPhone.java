package com.guircai.design.structural.bridge;

public class MiPhone extends AbstractPhone{

    @Override
    String getPhone() {
        return "MiPhone" + sale.getSaleInfo();
    }
}
