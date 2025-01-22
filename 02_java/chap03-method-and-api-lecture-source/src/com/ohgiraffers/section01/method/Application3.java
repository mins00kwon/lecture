package com.ohgiraffers.section01.method;

public class Application3 {
    static int global=10;                                   // 클래스 내부는 지역으로 보지 않고 전체로 본다
                                                            // 클래스에서 선언된 전역 변수는 클래스 전체에서 사용 가능
    int global2=20;
    //질문: 전역 변수에 static을 붙이지 않는다면?
    public static void main(String[] args) {
        /* 목표: 메소드 전달연산자(argument)와
                매개변수(parameter)에 대해 이해하고
        *       메소드 호출 시 활용할 수 있다*/
        /* 설명:
        *   변수를 선언한 위치에 따라 구분할 수 있다
        *   1. 지역 변수
        *   2. 전역 변수
        *   3. 매개 변수
        * */
        Application3 app3 = new Application3();
        app3.testMethod(31);                            // 이걸 전달인자라고 하는거였음

        int local=20;
        System.out.println("local = " + local);             // 지역 변수
        /* 설명: 중괄호가 하나의 지역이다
        *   지역 변수는 선언 코드 이후에 사용 가능하다
        *       코드 순서가 중요!
*               */

        System.out.println("global = " + global);
        System.out.println("app3.global2 = " + app3.global2);
    }

    public void testMethod(int age) {                       // 파라미터는 이것만 파라미터였음
        System.out.println("당신의 나이는: "+age +"세입니다");
    }
}
