package com.ohgiraffers.section01.exception;

public class Application {
    public static void main(String[] args) throws Exception {

        /* 목표: 예외에 대해 이해하고 이를 처리하기 위한 문법을 활용할 수 있다*/
        /* 설명:
        *   1. throws를 통한 위임
        *   2. try-catch를 통한 처리*/

        /* 목차: 1. try-catch로 처리 시 */
//        ExceptionTest et=new ExceptionTest();

//        et.checkEnoughMoney(50000,10000);



        /* 목차: 2. try-catch로 처리 시 */

        //         region try-catch
/*
        try {
            et.checkEnoughMoney(10000, 50000);
            et.checkEnoughMoney(10000, 5000);
        }
        catch (Exception e) {
//            System.out.println("호주머니!!!!!1 호주머니!!!!!1");

            *//* 설명: try 블럭에서 발생한 예외(객체)를 처리하는 부분
            *   예외 객체를 활용하게 되면 해당 예외 객체의 메소드를 사용할 수 있다.
            * *//*

            *//* 설명: 예외 메시지와 발생한 문제들을 추적할 수 있게 빨간 글씨와 메세지로 처리되는 방식*//*
            e.printStackTrace();    // 익히 보던 빨간 에러 글씨
                                    // 명시화 해두면 빨간글씨는 뜨지만 에러는 발생하지 않음

            System.out.println(e.getMessage()+"때문에 에러 발생함");
            *//*System.exit(0);*//*     // 자바 어플리케이션이 즉시 종료되도록 처리하는 코드
        }
        System.out.println("프로그램을 종료합니다.");*/
        // endregion

        // try 블럭에서 생성한 변수는 catch 블럭에서 사용할 수 없다.
        try {
            int num = 10;
            System.out.println(num / 0);
        }
        // Exception 이라고 해도 다형성을 통해 ArithmaticException 의 함수를 호출하게 된다
        catch (Exception e) {
            System.out.println("divide by zeror");
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램을 종료합니다");
    }
}
