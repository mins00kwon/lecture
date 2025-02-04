package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eats 토끼");
    }

    @Override
    public void run() {
        System.out.println("Tiger runs 어슬렁 어슬렁");
    }

    @Override
    public void cry() {
        System.out.println("Tiger cry 어흥어흥");
    }

    public void bite(){
        System.out.println("호랑ㅇ이가 물어뜯습니다. 앙");
    }
}
