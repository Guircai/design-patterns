package com.guircai.design.structural.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 使用cglib帮我们创建出代理对象
 */
public class CglibProxy {
    
    // 为任意对象创建代理
    public static<T> T createProxy(T t) {
        
        // 1. 创建一个增强器
        Enhancer enhancer = new Enhancer();

        // 2. 设置要增强哪个类的功能，增强为这个类动态创建一个子类
        enhancer.setSuperclass(t.getClass());

        // 3. 设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, 
                                    Method method, // 为了能获取到原方法的一些元数据信息
                                    Object[] args, 
                                    MethodProxy proxy) throws Throwable {
                // 编写拦截的逻辑
                System.out.println("cglib上场了........XXX");

                // 当前方法的信息
                // method.get

                // 目标方法进行执行
                Object invokeSuper = proxy.invokeSuper(obj, args);

                return invokeSuper;
            }
        });


        Object o = enhancer.create();

        return (T)o;
    }
}
