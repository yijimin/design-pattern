package com.gupao.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 *  on 2019/3/10.
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
