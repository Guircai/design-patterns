package com.guircai.design.structural.facade;

/**
 * 门面模式
 * 
 * 需求：来回跑太麻烦，按照最少知道原则，我就想和一个部门进行交互。
 */
public class MainTest {
    public static void main(String[] args) {
        
        // Edu edu = new Edu();
        // edu.assignSchool("雷丰阳");

        // Police police = new Police();
        // police.resgister("雷丰阳");

        // Social social = new Social();
        // social.handleSocial("雷丰阳");

        WeiXinFacade weiXinFacade = new WeiXinFacade();
        weiXinFacade.handleXXX("雷丰阳");

        weiXinFacade.resgister("雷丰阳");
        weiXinFacade.assignSchool("雷丰阳");
    }
}
