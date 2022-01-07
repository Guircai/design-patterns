package com.guircai.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * 使用组合模式，组织层级结构的数据
 */
@Data
public class Menu {
    private Integer id;
    private String name;

    public Menu(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    // 组合模式关注点
    private List<Menu> childs = new ArrayList<>();

    // 添加提供层级的方法
    public void addChildMenu(Menu menu) {
        childs.add(menu);
    }

    // 层级遍历方法
    public void printMenu() {
        System.out.println(name);
        if (childs.size() > 0) {
            for (Menu child : childs) {
                child.printMenu();
            }
        }
    }
}
