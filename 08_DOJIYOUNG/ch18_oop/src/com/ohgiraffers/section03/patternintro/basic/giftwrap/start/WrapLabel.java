package com.ohgiraffers.section03.patternintro.basic.giftwrap.start;

/* 포장 종류마다 화면에 보일 이름을 정한다. */
public class WrapLabel {

    public String label(String type) {
        if (type.equals("BASIC")) {
            return "기본 포장";
        }
        if (type.equals("PREMIUM")) {
            return "고급 포장";
        }
        return "알 수 없는 포장";
    }
}