package com.guircai.design.behavioral.chain.ext;

/**
 * 抽象类 过滤类
 */
public interface Filter {
    
    void doFilter(Request request, Response response, FilterChain chain);
}
