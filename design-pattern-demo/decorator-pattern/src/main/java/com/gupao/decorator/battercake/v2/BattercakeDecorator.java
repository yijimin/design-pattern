package com.gupao.decorator.battercake.v2;

/**
 * 扩展套餐的抽象装饰者
 */
public abstract class BattercakeDecorator extends Battercake {
    //静态代理，委派
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }
    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
