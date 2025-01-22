package com.ohgiraffers.section01.literal;

public class Application1 {
    public static void main(String[] args) {
        /*
        todo.
         */
        /*목표: 여러 가지 값의 형태를 출력할 수 있다*/
        // 목차 1: 숫자 형태의 값
        // 목차 1-1. 정수 형태의 값 출력
        System.out.println(123);

        /* 목차 1-2. 실수 형태의 값 출력*/
        System.out.println(1.234);

        /* 목차 2-1. 문자 형태의 값 출력 */
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000'); //아무 값도 없다는 뜻의 문자 자료형
        //문자 자료형에 아무것도 넣지 않으면 오류 발생

        /* 목차 3: 문자열 형태의 값 출력*/
        System.out.println("안녕하세요");
        System.out.println("a");
        System.out.println("");

        /* 목차 4: 논리 형태의 값 출력*/
        System.out.println(true);
        System.out.println("true");
        System.out.println(false);
        System.out.println("false");
    }
}
