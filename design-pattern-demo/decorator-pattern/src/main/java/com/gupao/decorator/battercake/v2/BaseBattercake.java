package com.gupao.decorator.battercake.v2;

/**
 * 基础套餐
 */
public class BaseBattercake extends Battercake {
    protected String getMsg(){
        return "煎饼";
    }
    public int getPrice(){
        return 5;
    }
}
