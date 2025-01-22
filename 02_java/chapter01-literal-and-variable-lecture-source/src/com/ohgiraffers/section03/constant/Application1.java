package com.ohgiraffers.section03.constant;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 상수에 대해 이해하고 사용할 수 있다*/
        final int AGE;          // 상수명은 대문자로 하는게 관례인가봄

        AGE = 10;
        // AGE=20;              // 바로 오류남
        // 초기화 이후 값을 담을 수 없다.

        System.out.println("AGE = " + AGE);

        final double PI = 3.14;
        /* 설명: 프로그램 전체에서 고정해서 사용할 값을 지정할 용도*/
    }
}
