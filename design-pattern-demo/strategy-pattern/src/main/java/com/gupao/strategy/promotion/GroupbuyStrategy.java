package com.gupao.strategy.promotion;

/**
 * 拼团优惠
 *
 */
public class GroupbuyStrategy implements PromotionStrategy{

    public void doPromotion() {
        System.out.println("拼团，满20人成团，全团享受团购价");
    }
}
