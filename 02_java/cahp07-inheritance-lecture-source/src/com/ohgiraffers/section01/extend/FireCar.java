package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    public FireCar() {
        /* 설명: 부모로부터 생성자는 물려받지 않고 super()를 통해 부모 객체만 먼저 생성*/
        super();        // 안 적어도 자동 작성됨
        System.out.println("Fire Car Constructor called");
    }

    @Override
    /* 설명:
    *   @Override 어노테이션을 사용하는 이유?
    *   1. 가독성: 메소드 중 부모로부터 물려받아 재정의 하는 메소드를 파악하기 용이하도록
    *   2. 휴먼 에러 체크: 메소드 이름 오타나면 삐용삐용 해줌*/
    public void soundHorn() {
        System.out.println("빠아아아아아아아아앙~~~!!! 빵빵빠아아아아아아아아아앙~~!");
    }

    /* 설명: 부모로부터 물려받는 필드 및 메소드 외에 더 추가 가능*/
    public void sprayWater(){
        System.out.println("Fire Car Spray Water");
    }
}
