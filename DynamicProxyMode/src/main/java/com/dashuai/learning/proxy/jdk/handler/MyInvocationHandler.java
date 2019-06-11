package com.dashuai.learning.proxy.jdk.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理处理类
 * <p/>
 * Created in 2019.06.05
 * <p/>
 *
 * @author Liaozihong
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    /**
     * Bind object.
     *
     * @param object the object
     * @return the object
     */
    public Object bind(Object object){
        this.target = object;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke");
        method.invoke(target, args);
        System.out.println("after invoke");
        return null;
    }
}
