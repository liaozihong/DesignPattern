package com.dashuai.learning.delegatemode.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Event
 * <p/>
 * Created in 2019.06.12
 * <p/>
 *
 * @author Liaozihong
 */
public class Event {
    private Object obj;
    private String method;
    private Object[] params;
    private Class[] paramTypes;

    /**
     * Instantiates a new Event.
     *
     * @param obj    the obj
     * @param method the method
     * @param args   the args
     */
    public Event(Object obj, String method, Object... args) {
        this.obj = obj;
        this.method = method;
        this.params = args;
        this.contractParamTypes(this.params);
    }

    private void contractParamTypes(Object[] params) {
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }

    /**
     * Invoke.
     *
     * @throws InvocationTargetException the invocation target exception
     * @throws IllegalAccessException    the illegal access exception
     * @throws NoSuchMethodException     the no such method exception
     */
    public void invoke() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method method = obj.getClass().getMethod(this.method, this.paramTypes);
        if (null == method) {
            return;
        }
        method.invoke(this.obj, this.params);
    }
}
