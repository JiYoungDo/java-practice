package com.ohgiraffers.section04.singleton.basic.scoreboard.start;

/* 이른 초기화 싱글톤 점수판이다. enum 싱글톤 ScoreBoard로 옮긴 뒤 지운다. */
// TODO 단계 4: 쓰지 않게 된 이 파일을 지운다
public class OldScoreBoard {

    private static OldScoreBoard instance = new OldScoreBoard();

    private int total;

    private OldScoreBoard() {
    }

    public static OldScoreBoard getInstance() {
        return instance;
    }

    public void add(int point) {
        total = total + point;
    }

    public int getTotal() {
        return total;
    }
}