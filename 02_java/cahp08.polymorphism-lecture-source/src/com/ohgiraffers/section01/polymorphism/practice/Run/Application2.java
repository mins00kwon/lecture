package com.ohgiraffers.section01.polymorphism.practice.Run;

import com.ohgiraffers.section01.polymorphism.practice.DTO.Car;
import com.ohgiraffers.section01.polymorphism.practice.DTO.ModerCar;

/* 설명: 같은 클래스를 다형성을 통해 생성하던 자기 자신에 대해 생성하던 똑같음*/
public class Application2 {
    public static void main(String[] args) {
        System.out.println("=-=-=-= Car / Modern Car=-=-=-=-=");
        Car modernCar = new ModerCar();
        System.out.println("=-=-=-= Modern Car / Modern Car=-=-=-=-=");
        ModerCar moderCar2 = new ModerCar();
    }
}
