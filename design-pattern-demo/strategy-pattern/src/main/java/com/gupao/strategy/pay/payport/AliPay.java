package com.gupao.strategy.pay.payport;


/**
 * 具体的支付方式
 */
public class AliPay extends Payment {

    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }

}
