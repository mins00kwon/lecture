package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    /* 설명: 이걸 속성이라고 함*/

    String name;
    int hp;

    public void setHp(int hp) {
        if (hp >= 100) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public void setName(String 조윤태) {

    }
}
