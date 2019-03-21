package com.gupao.adapter.loginadapter.v2.adapters;


import com.gupao.adapter.loginadapter.ResultMsg;

/**
 *  on 2019/3/16.
 */
public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
