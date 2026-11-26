package com.ohgiraffers.section03.patternintro.basic.tax.start;

public class VatTax implements Tax {

    @Override
    public int apply(int price) {
        return price + price / 10;
    }
}