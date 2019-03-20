package com.gupao.proxy.dynamicproxy.jdkproxy;


import com.gupao.proxy.Person;

/**
 *被代理对象
 */
public class Customer implements Person {
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
    }
}
