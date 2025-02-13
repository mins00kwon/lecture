package com.ohgiraffers.section02.section02.functionInterface;

import java.util.Objects;
import java.util.function.Predicate;

public class Application5 {
    public static void main(String[] args) {
        /* 목표: 표준 함수적 인터페이스 중 Predicate에 대해 이해하고 사용할 수 있다*/

        /* 필기: Predicate이란
        *   test***() 메소드 사용
        *   매개변수를 받아서 boolean 을 리턴함 */

        Predicate<Object> predicate=value->value instanceof String;
        System.out.println(predicate.test("hello"));
        System.out.println(predicate.test(123));
    }
}
