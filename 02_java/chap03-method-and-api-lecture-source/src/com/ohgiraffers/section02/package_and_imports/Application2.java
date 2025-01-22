package com.ohgiraffers.section02.package_and_imports;

import com.ohgiraffers.section01.method.Calculator;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: import 에 대해 이해할 수 있다*/
        Calculator cal=new Calculator();
        int result1=cal.minNumbersOf(10,20);
        int result2=Calculator.maxNumbersOf(10,20);
        int result3=cal.plusTwoNumbers(result1,result2);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
// non static 이면 객체를 만들어야 한다는 거고
// static 이면 경로만 제대로 지정해주면 된다는 거고
// import 를 하면? non static 의 경우 객체 생성이 편해지는거고
// import 를 하면? static 은 클래스이름.함수명 으로 객체 생성 안해도 함수 쓸 수 있는거
// 질문: .* 에 대해 고민해보자