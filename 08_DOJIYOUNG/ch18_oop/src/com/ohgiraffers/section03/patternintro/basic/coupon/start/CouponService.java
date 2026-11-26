package com.ohgiraffers.section03.patternintro.basic.coupon.start;

/* 머리말과 본문을 이어 붙여 쿠폰 문구를 완성한다. */
// TODO 단계 3: 쓰지 않게 된 이 파일과 CouponTitle.java, CouponBody.java를 지운다
public class CouponService {

    private CouponTitle title = new CouponTitle();
    private CouponBody body = new CouponBody();

    public String issue(String name) {
        return title.make(name) + " " + body.make();
    }
}