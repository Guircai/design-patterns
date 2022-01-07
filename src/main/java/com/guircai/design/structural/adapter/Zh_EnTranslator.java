package com.guircai.design.structural.adapter;

/**
 * ZH_EN编译器
 */
public class Zh_EnTranslator implements Translator{

    public String translate(String content) {
        if ("你好".equals(content)) {
            return "Hello";
        }
        if ("什么".equals(content)) {
            return "What";
        }
        return "********";
    }
}
