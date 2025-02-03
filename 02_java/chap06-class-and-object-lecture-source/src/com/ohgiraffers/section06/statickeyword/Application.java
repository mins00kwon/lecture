package com.ohgiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {
        /* 목표: static 키워드에 대해 이해할 수 있다*/

        /* 설명:
         *   static
         *   프로그램이 실행될 때 정적 메모리 영역(static 영역 또는 클래스 영역)에 할당되는 키워드
         *   아래 인스턴스가 공유해서 사용할 목적의 공간이다
         *   대표적인 에로 싱글톤(singleton) 객체와 설정값 변수 등이 있다.*/
        StaticTest st1 = new StaticTest();

        /* 설명: 현재 두 필드가 가지고 있는 값 확인*/
        System.out.println("non static field: " + st1.getNonStaticCount());
        System.out.println("static field: " + StaticTest.getStaticCount());

        /* 설명: 각 필드 값을을 증가*/
        st1.increaseNonStaticCount();
        StaticTest.increaseStaticCount();

        System.out.println("-=-=-=-=-=-");
        System.out.println("각 변수를 1씩 증가");

        /* 설명: 현재 두 필드가 가지고 있는 값 확인*/
        System.out.println("non static field: " + st1.getNonStaticCount());
        System.out.println("static field: " + StaticTest.getStaticCount());

        System.out.println("-=-=-=-=-=-");
        System.out.println("새로운 객체 생성");

        /* 설명: 새로운 객체 생성 후 적용*/
        StaticTest st2 = new StaticTest();
        System.out.println("non static field: " + st2.getNonStaticCount());
        System.out.println("static field: " + StaticTest.getStaticCount());
    }
}
