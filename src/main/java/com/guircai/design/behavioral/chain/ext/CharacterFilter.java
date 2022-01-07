package com.guircai.design.behavioral.chain.ext;

public class CharacterFilter implements Filter{

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.msg += "0000";
        System.out.println("CharacterFilter...doFilter之前");
        
        // 放行
        chain.doFilter(request, response, chain);
        System.out.println("CharacterFilter...doFilter之后");
    }
}
