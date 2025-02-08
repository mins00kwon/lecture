package com.ohgiraffers.section01.polymorphism.practice;

import com.ohgiraffers.section01.polymorphism.practice.DTO.Avante;
import com.ohgiraffers.section01.polymorphism.practice.DTO.Car;
import com.ohgiraffers.section01.polymorphism.practice.DTO.Sonata;

public class PracticeInstanceOf {
    public static void main(String[] args) {
        Car avante=new Avante();
        Car sonata=new Sonata();

        /* 설명: 잘못된 다운캐스팅으로 오류 발생
        *   다운캐스팅 오류는 런타임 에러라서 컴파일 단계에서는 발견 불가능*/
        /*Avante newAvante=(Avante)sonata;*/

        if(sonata instanceof Avante){
            System.out.println("this car is Avante");
            Avante avante1=(Avante)(sonata);
        }else {
            System.out.println("this car is Not Avante");

        }

    }
}
