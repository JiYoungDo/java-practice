package com.ohgiraffers.section03.patternintro.basic.tax.start;

// TODO 단계 3: 쓰지 않게 된 이 파일과 VatTax.java, Tax.java를 지운다
public class TaxFactory {

    public static Tax create() {
        return new VatTax();
    }
}