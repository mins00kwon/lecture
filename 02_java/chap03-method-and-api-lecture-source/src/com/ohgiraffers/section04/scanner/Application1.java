package com.ohgiraffers.section04.scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: java.util.Scanner를 이용해 다양한 자료형의 값 입력 받기*/
        Scanner sc = new Scanner(System.in);

        /* 설명: 중요
        *   next() 를 이용한 문자열 입력*/
        // 설명 next 는 띄어쓰기나 엔터가 인지되지 않고 버퍼에 남아있는다.
        System.out.printf("소속을 입력하세요");
        String className = sc.next();
        System.out.println("className = " + className);

        /* 설명: nextLine() 함수를 활용한 콘솔에서의 문자열 입력*/
        String name=sc.nextLine();
        System.out.println("name = " + name);

        /* 설명: nextInt() 함수를 활용한 콘솔에서의 정수 입력*/
        int age=sc.nextInt();
        System.out.println("age = " + age);
        System.out.print("args = " + Arrays.toString(args));

    }
    }
