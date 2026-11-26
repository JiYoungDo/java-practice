package com.ohgiraffers.section03.patternintro.basic.giftwrap.start;

/* 포장 종류마다 요금을 정한다. */
public class GiftWrap {

    public int fee(String type) {
        if (type.equals("BASIC")) {
            return 1000;
        }
        if (type.equals("PREMIUM")) {
            return 3000;
        }
        return 0;
    }
}