package com.ohgiraffers.section02.package_and_imports;
import static com.ohgiraffers.section01.method.Calculator.maxNumbersOf;

import com.ohgiraffers.section01.method.Calculator.*; // 질문: 이건 어따 쓰노ㅋㅋ

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 패키지에 대해 이해할 수 있다*/
        /* 설명:
        *   패키지의 의미
        *   1. 클래스의 소속
        *   2. 원래는 클래스명의 일부분이다
        *   3. 경우에 따라 생략 가능하다
    *           질문: 어떤 경우?*/

        /* 설명: non-static 메소드 호출을 위해 Calculator 인지(feat. 다른 패키지에서)*/
        com.ohgiraffers.section01.method.Calculator cal = new com.ohgiraffers.section01.method.Calculator();
        int result=cal.plusTwoNumbers(100,200);
        System.out.println("result = " + result);

        /* 설명: static 메소드 호출해보기(feat. 다른 패키지에서)*/
        int result2=com.ohgiraffers.section01.method.Calculator.maxNumbersOf(100,200);
        System.out.println("result2 = " + result2);
        /* 설명: 객체를 생성하지 않아도 되지만 미리 import 해두지 않으면 경로를 모두 지정해줘야 함*/
        /* 설명: 경로 지정하기는 너무 기니까 앞에서 미리 하도록 만들어둔게 import*/
    }
}
// non static 이면 객체를 만들어야 한다는 거고
// static 이면 경로만 제대로 지정해주면 된다는 거고
