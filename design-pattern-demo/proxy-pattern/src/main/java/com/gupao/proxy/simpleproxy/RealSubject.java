package com.gupao.proxy.simpleproxy;

/**
 * 真实对象（被代理对象）
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
