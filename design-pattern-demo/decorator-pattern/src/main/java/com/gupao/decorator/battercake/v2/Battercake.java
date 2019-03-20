package com.gupao.decorator.battercake.v2;

/**
 * 煎饼的抽象Battercake  最初的状态 还未进行装饰
 */
public abstract class Battercake {
    protected abstract String getMsg();
    protected abstract int getPrice();
}
