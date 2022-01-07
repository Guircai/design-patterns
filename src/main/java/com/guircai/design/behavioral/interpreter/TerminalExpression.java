package com.guircai.design.behavioral.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * 多少种解析规则就需要定义多少种规则类
 */
public class TerminalExpression extends AbstractIDCardExpression{

    Set<String> data = new HashSet<>();
    String symbol ;   // 定义解析用的符号如  : -

    public TerminalExpression(Set<String> data, String symbol) {
        this.data = data;
        this.symbol = symbol;
    }

    @Override
    boolean interpreter(String expression) {
        // 上海市:张文宏-医生
        // 1. 按照指定符号分割
        String[] split = expression.split(symbol);

        // 冒号:    上海市          张文宏-医生
        // 短横线   上海市:张文宏    医生
        boolean result = false;
        for (String s : split) {
            // 说明有免费的信息在里面
            if (data.contains(s)) {
                return true;
            }
        }
        return false;
    }
}
