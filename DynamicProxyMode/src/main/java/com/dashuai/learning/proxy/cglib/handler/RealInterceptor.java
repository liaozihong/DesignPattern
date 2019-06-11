package com.dashuai.learning.proxy.cglib.handler;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Real interceptor
 * <p/>
 * Created in 2019.06.05
 * <p/>
 *
 * @author Liaozihong
 */
public class RealInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("== BEFORE ==");
        Object re = methodProxy.invokeSuper(o, objects);
        System.out.println("== AFTER ==,result:" + re);
        return re;
    }
}
