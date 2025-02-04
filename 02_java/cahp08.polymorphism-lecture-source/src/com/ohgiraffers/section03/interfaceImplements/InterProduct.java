package com.ohgiraffers.section03.interfaceImplements;

public interface InterProduct extends ParentInterProduct,AnotherParentInterProduct{
    /* 설명: public static final 이 필수이므로 생략 가능하다*/
    public static final int MAX_NUM=100;        // 얘는 심지어 초기화가 필수네
    /* 설명: 인터페이스는 클래스가 아니므로 생성자를 가질 수 없다
    *   = 객체를 만들 수 없다*/
    // public Interproduc(){} -> error

    /* 설명: 반환형, 함수 이름, 매개변수를 지정함
    *   이거 오버라이딩 해서 쓰십쇼 하는거ㅇㅇ*/
    public void nonStaticMethod();  // 일단 {} 도 없고 끝에 ; 도 붙임
//    public abstract void staticMethod();    // 이게 정석 형태. abstract는 생략 가능. 생략해도 abstract 인거임

    /* 설명: static 메소드를 사용하면 메소드의 바디부까지 작성이 가능하다*/
    public static void staticMethod() {}

    /* 설명: non-static 메소드도 default 키워드를 사용하면 메소드의 바디부까지 작성이 가능하다*/
    public default void method() {}         // 함수에 default...? 뭐였더라...?

    /* 설명: 접근 제어자가 private인 메소드는 메소드의 바디부까지 작성이 가능하다(default 없이도)*/
//    private void privateMethod() {} //질문: 왜 안됨?
    /* 설명: 바디부가 있다는건 규약이 아니라는 것*/
}
