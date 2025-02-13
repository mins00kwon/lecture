package com.ohgiraffers.section01.intro;

/* 필기: "Functional Interface"
*   추상 메소드를 하나만 가지는 인터페이스
*   @FunctionalInterface 어노테이션을 붙일 수 있다
*       안붙여도 상관은 없음
*       붙일 경우 휴먼 에러를 방지해줌*/

/* 설명: FunctionalInterface만 람다식으로 적용 가능하다*/

@FunctionalInterface
public interface Calculator {
    int sumTwoNumbers(int first, int second);
}
