package com.ohgiraffers.section01.polymorphism.practice.Run;

import com.ohgiraffers.section01.polymorphism.practice.DTO.Car;
import com.ohgiraffers.section01.polymorphism.practice.DTO.OldCar;
import com.ohgiraffers.section01.polymorphism.practice.DTO.RacingCar;

/* 설명: 다형성 작동 확인 1*/
public class Application1 {
    public static void main(String[] args) {
        System.out.println("==Car==");
        Car car = new Car();

        System.out.println("==RacingCar==");
        Car racingCar = new RacingCar();

        System.out.println("==OldCar==");
        Car oldCar = new OldCar();
    }
}
