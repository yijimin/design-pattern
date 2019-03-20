package com.gupao.decorator.battercake.v2;

/**
 * 鸡蛋装饰者  可以计算添加鸡蛋之后的价格
 */
public class EggDecorator extends BattercakeDecorator {
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    protected void doSomething() {
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
