package com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args) {
        /* 목표: 싱글톤 패턴에 대해 이해할 수 있다*/

        /* 설명: singleton pattern 이란?
         *   애플리케이션이 시작되고 난 후 어떤 클래스가 최초 한번만 메모리에 할당되고 (객체화)
         *   그 메모리에 인스턴스가 단 하나만 생성되어 공유되게 하는 것을 싱글톤 패턴이라고 한다
         *   (메모리 및 리소스 낭비 방지 목적)*/

        /* 설명: 장점
         *   1. 첫 번째 이용 시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않지만
         *       두 번째 이후 이용 시에는 인스턴스 생성 시간 없이 바로 사용할 수 있다 (재사용)
         *   2. 인스턴스가 절대적으로 한 개만 할당 되는 것을 보증할 수 있다*/
        /* 설명: 단점
         *   1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다
         *   2.  동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 높다
         *      -여러 객체(또는 사용자) 가 하나의 리소스를 참고하는 경우*/
        /* 설명: 구현 방법
         *   1. 이른 초기화(Eager initialization)
         *   2. 늦은 초기화(Lazy Initialization)*/


        /* 설명: EagerSingleton은 프로그램 시작 시 바로 객체가 할당*/
        EagerSingleton es1 = EagerSingleton.getInstance();
//        EagerSingleton es2 = EagerSingleton.getInstance();
//
//        /* 설명: 두 변수의 주소값이 같다
//         *   즉 같은 객체를 가르킨다*/
//        System.out.println("es1 주소: " + es1);
//        System.out.println("es2 주소: " + es2);
//
//        /* 설명: LazySingleton은 최초 호출 시 객체가 할당*/
//        LazySingleton la1 = LazySingleton.getInstance();
//        LazySingleton la2 = LazySingleton.getInstance();
//        System.out.println("la1 주소: " + la1);
//        System.out.println("la2 주소: " + la2);
    }
}
