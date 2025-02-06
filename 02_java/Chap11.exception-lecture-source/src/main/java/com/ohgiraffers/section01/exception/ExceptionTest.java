package com.ohgiraffers.section01.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("가지고 계신 돈은 "+money+"원 입니다.");
        if(money >= price) {
            System.out.println(price+"원 상품을 구입하기 위한 금액이 충분합니다.");
            return;
        }
        /* 설명: 예외 상항에 Exception을 상속 받는 클래스의 객체를 생성하고 throw를 발생시킴*/
        /* 설명: 이게 '예외처리'다*/
        throw new ArithmeticException("호주머니 사정이 딱하군요 ");
    }
}
