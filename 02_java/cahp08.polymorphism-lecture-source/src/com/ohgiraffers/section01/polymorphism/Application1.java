package com.ohgiraffers.section01.polymorphism;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 다형성과 타입 형변환에 대해 이해할 수 있다*/
//        Animal animal = new Animal();
//        animal.eat();
//        animal.run();
//        animal.cry();
//        System.out.println();
//
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();
//
//        System.out.println();
//
//        Rabbit rabbit = new Rabbit();
//        rabbit.eat();
//        rabbit.run();
//        rabbit.cry();
//        rabbit.jump();

        Animal ani1 = new Animal();         // 다형성 아님
        Animal ani2 = new Tiger();          // 다형성 맞음
        Animal ani3 = new Rabbit();         // 다형성 맞음

        /* 설명: Animal 은 Tiger 나 Rabbit이 아니다*/
        /*Tiger tiger1 = new Animal();        // 다형성 아님*/

        /* 설명: 동적 바인딩 확인하기
        *   컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가
        *   런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩 되어 바뀌어 동작하는 것을 의미한다
        *   동적 바인딩의 조건: 상속, 다형성, 오버라이딩*/
        ani1.cry();
        ani2.cry();
        ani3.cry();

        /* 설명: 부모 타입을 강제로 자식 타입으로 형변환 하는 것이 가능은 하다
        *   단 굉장히 조심해야 한다
        *       조심해라: instanceOf로 한번 걸러줘라*/
        ((Tiger)ani2).bite();
        /* 설명: 코드 상에서는 에러가 안나는데 실행하면 오류남*/
//        ((Rabbit)ani2).jump();

        /* 설명: instanceOf란?
        *   해당 객체의 타입을 런타임 시점에 확인하기 위한 연산자
        *   반환형은 boolean*/
        if(ani2 instanceof Tiger){
            ((Tiger)ani2).bite();
        }if(ani3 instanceof Rabbit){
            ((Rabbit)ani3).jump();
        }if(tiger instanceof Animal){
            System.out.println("Animal은 맞지~");
        }
    }
}
