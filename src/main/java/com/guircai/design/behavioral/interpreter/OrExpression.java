package com.guircai.design.behavioral.interpreter;

/**
 * 非终结表达式
 */
public class OrExpression extends AbstractIDCardExpression{

    // 组合两个终结表达式，最终的判断结果是终结表达式判断出来的，这个表达式只是一个桥梁。
    private AbstractIDCardExpression cityExp;
    private AbstractIDCardExpression typeExp;

    public OrExpression(AbstractIDCardExpression cityExp, AbstractIDCardExpression typeExp) {
        this.cityExp = cityExp;
        this.typeExp = typeExp;
    }

    @Override
    boolean interpreter(String expression) {
        return cityExp.interpreter(expression) || typeExp.interpreter(expression);
    }
}
