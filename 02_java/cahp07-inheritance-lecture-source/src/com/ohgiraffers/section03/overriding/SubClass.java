package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {
    /* 설명: 부모 메소드의 헤드부와 일치하게 오버라이딩*/

//    @Override
//    public void method(int num) {
//
//    }

    /* 설명: 메소드 이름 변경하면 안됨*/
//    @Override
//    public void method1(int num){}

    /* 설명: 메소드의 반환현(리턴 타입) 변경 불가능*/
//    @Override
//    public String method(int num){return "";}

    /* 설명: 경우에 따라서는 메소드의 변환형을 달리 해도 오버라이딩이 성립함
    *   이 경우라 함은
    *   부모 메소드 리턴 입의 자식 타입으로 자식 메소드의 반환형을 지정하는 경우
    *   부모 메소드의 반환형을 Object로 하고, 자식 메소드에 아무거나 쓰는 형식이 일반적*/
//    @Override
//    public String method2(int num){return "";}

    /* 설명: 부모 메소드가 private 이라면 오바라이딩 불가능*/
//    @Override
//    private void privateMethod(){}

    /* 설명: 부모 메소드가 final 이라면 오버라이딩 불가능*/
//    @Override
//    public void finalMethod(){}

    /* 설명: 다른 패키지더라도 protected를 썼으면 상속관계이므로 오버라이딩 성립*/
    /* 설명: 더 큰 범위로 접근 제어자를 바꾸는건 성립*/
//    @Override
//    public void protectedMethod() {}

    /* 설명: default 메소드는 다른 패키지가 되면 오버라이딩 불가능*/
//    @Override
//    void defaultMethod() {}

}
