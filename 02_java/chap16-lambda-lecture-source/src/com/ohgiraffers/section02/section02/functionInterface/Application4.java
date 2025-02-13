package com.ohgiraffers.section02.section02.functionInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {
    public static void main(String[] args) {
        /* 목표: 표준 함수적 인터페이스 중 Operator에 대해 이해하고 사용할 수 있다*/
        /* 필기: Operator에 대해서는 자세히 말씀 안하심. 이따 다시 보자. */
        /* 필기:
        *   function과 똑같이 작동.
        *   apply***)() 메소드 사용
        *   Function과 다른 점: 제네릭을 하나만 사용하고, 매개변수와 반환형의 타입이 같음 */
        /* 설명: Function의 변형체라고 설명하심*/

        /* 필기: 매개변수와 반환형이 모두 String 이라는 뜻 */
        UnaryOperator<String> operator = str->str+" World";
        System.out.println(operator.apply("Hello"));

        BinaryOperator<String> binaryOperator = (a,b)->a+" "+b;
        System.out.println(binaryOperator.apply("Nice","to meet you!"));
    }
}
