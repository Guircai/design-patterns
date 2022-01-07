package com.guircai.design.structural.facade;

public class WeiXinFacade {
    Edu edu = new Edu();
    Police police = new Police();
    Social social = new Social();

    /**
     * 封装起来只留一个方法
     * 
     * @param name
     */
    public void handleXXX(String name) {
        edu.assignSchool(name);
        police.resgister(name);
        social.handleSocial(name);
    }

    public void resgister(String name) {
        police.resgister(name);
    }

    public void assignSchool(String name) {
        edu.assignSchool(name);
    }
}
