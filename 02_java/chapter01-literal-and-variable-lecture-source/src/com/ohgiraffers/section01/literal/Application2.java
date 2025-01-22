package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: 값을 직접 연산하여 출력할 수 있다*/
        System.out.println("정수와 정수의 연산");
        System.out.println(123+456);
        System.out.println(123-123);
        System.out.println(123*10);
        System.out.println(123/10);
        System.out.println(123%10);

        System.out.println("실수와 실수의 연산");
        System.out.println(1.23+1.23);
        System.out.println(1.23-1.23);
        System.out.println(1.23*10.0);
        System.out.println(1.23/10.0);
        System.out.println(1.23%1.0); // 실수는 정확하지 않고 근사한 값이다. 연산에 주의

        System.out.println("정수와 실수의 연산");
        System.out.println(123/5);// 정수끼리 나눗셈하면 몫을 반환
        System.out.println(123/5.0);// 정수와 실수 연산은 실수 반환
        // 결과값이 실수이길 바란다면 계산 인자중 최소 하나는 실수여야 한다.

        System.out.println("문자와 정수의 연산");
        System.out.println('a'+1);
        System.out.println('a'%2);
        //정수와 연산되면 아스키 코드로 처리됨

        System.out.println("문자열과 문자열의 연산");
        System.out.println("Hello"+"World~");
        /* 설명: 문자열과 문자열의 연산은 +만 가능하며 이어붙이는 효과가 발생한다*/

        System.out.println("문자열과 자료형의 연산");
        System.out.println("Hello World~"+123);
        System.out.println("Hello World~"+true);
        System.out.println(123*2+"Hello World~"+123.0*2);
        System.out.println(123+1+"Hello World~"+(123.0+2));
    }
}
