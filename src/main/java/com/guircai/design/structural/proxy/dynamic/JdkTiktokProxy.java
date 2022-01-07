package com.guircai.design.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkTiktokProxy<T> implements InvocationHandler{

    private T target;

    public JdkTiktokProxy(T target) {
        this.target = target;
    }

    /**
     * 获取被代理对象的代理对象
     * 
     * @param <T>
     * @param t
     * @return
     */
    public static<T> T getProxy(T t) {
        
        /**
         * ClassLoader loader, 当前被代理对象的类加载器
         * Class<?>[] interfaces, 当前被代理对象所实现的所有接口
         * InvocationHandler h 当前被代理对象执行目标方法的时候我们使用h可以定义拦截增强方法
         */
        Object o = Proxy.newProxyInstance(t.getClass().getClassLoader(),
                        t.getClass().getInterfaces(),
                        new JdkTiktokProxy<T>(t));

        return (T)o;
    }

    /**
     * 定义目标方法的拦截逻辑，每个方法都会进来的
     * 
     * @param proxy
     * @param method
     * @param args
     * @return 
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 反射执行
        System.out.println("真正执行被代理对象的方法");
        Object invoke = method.invoke(target, args);
        System.out.println("返回值：" + invoke);
        return invoke;
    }
    
}
