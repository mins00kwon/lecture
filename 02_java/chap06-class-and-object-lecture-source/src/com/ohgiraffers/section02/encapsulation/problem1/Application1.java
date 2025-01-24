package com.ohgiraffers.section02.encapsulation.problem1;

public class Application1 {
    public static void main(String[] args) {

        /* 목표: 필드에 직접 접근하는 경우 발생하는 문제점을 이해할 수 있다*/

        /* 설명: 몬스터 1마리 소환*/
        Monster monster1 = new Monster();
        monster1.name = "드라큘라";
        monster1.hp = 200;
        System.out.println("monster1 name = " + monster1.name);
        System.out.println("monster1 hp = " + monster1.hp);

        Monster monster2 = new Monster();
        monster2.name = "프랑켄";
        monster2.hp = -300;     // 입력 값을 검증할 수 없음
        monster2.setHp(-300);   // 입력 값을 검증하고 제한할 수 있음
        /* 설명: 이 때 내부의 setHp 메소드의 this.은 monster2.과 같은 의미*/

        System.out.println("monster2 name = " + monster2.name);
        System.out.println("monster2 hp = " + monster2.hp);
    }
}
