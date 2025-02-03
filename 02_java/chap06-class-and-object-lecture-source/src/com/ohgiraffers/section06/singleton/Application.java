package com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args) {
        /* 목표: 싱글톤 패턴에 대해 이해할 수 있다*/
        /* 설명: EagerSingleton은 프로그램 시작 시 바로 객체가 할당*/
        EagerSingleton es1 = EagerSingleton.getInstance();
        EagerSingleton es2 = EagerSingleton.getInstance();

        /* 설명: 두 변수의 주소값이 같다
         *   즉 같은 객체를 가르킨다*/
        System.out.println("es1 주소: " + es1);
        System.out.println("es2 주소: " + es2);

        /* 설명: LazySingleton은 최초 호출 시 객체가 할당*/
        LazySingleton la1 = LazySingleton.getInstance();
        LazySingleton la2 = LazySingleton.getInstance();
        System.out.println("la1 주소: " + la1);
        System.out.println("la2 주소: " + la2);
    }
}
