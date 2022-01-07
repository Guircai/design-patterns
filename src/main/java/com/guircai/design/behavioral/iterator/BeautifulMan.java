package com.guircai.design.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象渣男类
 */
public abstract class BeautifulMan {

    // 不方便暴露给外界的集合，只允许外界获取而不可以操作。
    List<String> girlFriends = new ArrayList<>();

    public void likeYou(String name) {
        girlFriends.add(name);
    }

    public void sayBye(String name) {
        girlFriends.remove(name);
    }

    public Itr gIterator() {
        return new Iterator();
    }

    /**
     * 抽象迭代器
     */
    public interface Itr {
        // 有没有下一个
        boolean hasNext();

        // 返回下一个
        String next();

        // 返回初恋(第一个)
        String firstLove();

        // 返回现任(最后一个女朋友)
        String current();
    }


    /**
     * 实体迭代器
     */
    public class Iterator implements Itr{

        private int cursor = 0; // 当前指针

        @Override
        public boolean hasNext() {
            return cursor < girlFriends.size();
        }

        @Override
        public String next() {
            cursor ++;
            return girlFriends.get(cursor);
        }

        @Override
        public String firstLove() {
            return girlFriends.get(cursor);
        }

        @Override
        public String current() {
            return girlFriends.get(girlFriends.size()-1);
        }
    }

}






