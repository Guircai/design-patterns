package com.guircai.design.behavioral.iterator;

public class MainTest {
    public static void main(String[] args) {
        MaYuCheng cheng = new MaYuCheng();

        cheng.likeYou("王刚1");
        cheng.likeYou("王刚2");
        cheng.likeYou("王刚3");

        BeautifulMan.Itr itr = cheng.gIterator();
        String firstLove = itr.firstLove();
        String next = itr.next();
        String current = itr.current();
        
        System.out.println(firstLove + next + current);
    }
}
