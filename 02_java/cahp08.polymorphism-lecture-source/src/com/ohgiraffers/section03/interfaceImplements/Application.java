package com.ohgiraffers.section03.interfaceImplements;

public class Application {
    public static void main(String[] args) {
        /* 목표: 인터페이스(interface)에 대해 이해할 수 있다*/
        /* 설명: 인터페이스란?
        *   자바의 클래스와 유사한 형태지만 상수필드(public static final)와
        *   추상메소드(public abstract)만 가질 수 있는
        *   "클래스의 변형체"이다.*/

//        InterProduct ip1=new InterProduct() -> 당연히 불가능
        Product p=new Product();
        InterProduct p2=new Product();          // 인터페이스도 다형성 적용 가능
                                                // 어짜피 Interproduct 객체가 생성될 일이 전혀 없으니까
        p.nonStaticMethod();
    }
}
