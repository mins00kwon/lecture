package com.ohgiraffers.section02.userexception;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: finallly를 활용한 try-catch를 이해하고 활용하기*/
        ExceptionTest et = new ExceptionTest();
        try{
            et.checkEnoughMoney(20000,500000);
        }catch(Exception e){
            System.out.println("유효성 검사 시 문제 발생: "+e.getMessage());
            /* 설명: 유효성 검사란?
            *   입력된 값이 유효한 값인지 의미없는 값인지 확인하는 것
            * */
        }
        /* 설명: finally 구문
        *   try 구문에서 예외 발생 여부와 상관 없이 실행되는 부분*/
        finally {
            System.out.println("finally 블럭 동작");
        }
        System.out.println("프로그램을 종료합니다");
    }
}
