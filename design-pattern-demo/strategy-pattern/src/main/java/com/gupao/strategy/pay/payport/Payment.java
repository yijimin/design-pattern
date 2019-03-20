package com.gupao.strategy.pay.payport;


import com.gupao.strategy.pay.MsgResult;

/**
 * 支付渠道
 * Payment 抽象类，定义支付规范和支付逻辑
 */
public abstract class Payment {

    //支付类型
    public abstract String getName();

    //查询余额
    protected abstract double queryBalance(String uid);

    //扣款支付
    public MsgResult pay(String uid, double amount) {
        if(queryBalance(uid) < amount){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","支付金额：" + amount);
    }

}
