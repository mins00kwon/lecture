package com.ohgiraffers.section02.section02.functionInterface;

import java.util.function.Consumer;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 표준 함수적 인터페이스 중 Consumer에 대해 이해하고 사용할 수 있다*/
        /* 설명: 반환형이 없는 메소드 관련 란다식*/
        Consumer<String> consumer = (str)-> System.out.println(str+"(이)가 입력됨");
        consumer.accept("피카츄");
        consumer.accept("hello");
    }
}
