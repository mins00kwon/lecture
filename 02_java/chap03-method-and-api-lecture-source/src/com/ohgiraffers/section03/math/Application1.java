package com.ohgiraffers.section03.math;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: Math 클래스에서 제공하는 static 메소드를 호출할 수 있다*/

        /* 설명: 다른 패키지에 있는 api 클래스는 import 또는 풀 클래스명을 써야되지만 java.lang 패키지는 생략 가능*/
        double result=java.lang.Math.abs(-32.1);
        /* 설명: java.lang: 경로
        *       Math: 클래스
        *       abs: 함수 이름
        *       static 이라서 객체를 생성하지 않아도 사용 가능*/
        double result2=Math.abs(-32.1);

        /* 설명: 최대값, 최소값 출력*/
        System.out.println("Math.max(result, result2) = " + Math.max(result, result2));
        System.out.println("Math.min(result, result2) = " + Math.min(result, result2));

        /* 설명: 난수 생성*/
        System.out.println("Math.random() = " + Math.random());
    }
}
