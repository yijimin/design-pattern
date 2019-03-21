package com.gupao.proxy.dynamicproxy.gpproxy;

import com.gupao.proxy.Person;
import com.gupao.proxy.dynamicproxy.jdkproxy.Customer;

/**
 *  on 2019/3/10.
 */
public class GPProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new GPMeipo().getInstance(new Customer());
            System.out.println(obj.getClass());
            obj.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
