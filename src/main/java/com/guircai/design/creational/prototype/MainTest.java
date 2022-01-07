package com.guircai.design.creational.prototype;

/**
 * 原型模式
 */
public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        GuiguMyBatis mybatis = new GuiguMyBatis();

        // 十分危险
        // 得到的是克隆体
        User zhangsan1 = mybatis.getUser("zhengsan");
        System.out.println(zhangsan1);
        zhangsan1.setName("李四2");
        System.out.println("zhangsan1自己修改了，" + zhangsan1);
        
        // 得到的是克隆体
        User zhangsan2 = mybatis.getUser("zhangsan");
        zhangsan2.setName("王五");
        System.out.println("2->" + zhangsan2);

        // 得到的是克隆体
        User zhangsan3 = mybatis.getUser("zhangsan");
        System.out.println("3->" + zhangsan3);

        // 得到的是克隆体
        User zhangsan4 = mybatis.getUser("zhangsan");
        System.out.println("4->" + zhangsan4);
    }
}
