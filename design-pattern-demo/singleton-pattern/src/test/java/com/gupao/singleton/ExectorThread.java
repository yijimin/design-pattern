package com.gupao.singleton;

import com.gupaoedu.vip.pattern.singleton.lazy.LazySimpleSingleton;
import com.gupaoedu.vip.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 *
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
//        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
