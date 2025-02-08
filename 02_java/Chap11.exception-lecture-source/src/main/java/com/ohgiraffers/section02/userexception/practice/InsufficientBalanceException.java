package com.ohgiraffers.section02.userexception.practice;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) { // 질문: 이 메시지는 어디서 받는거임?
                                                                // 내가 주는거지롱ㅋㅋ
        super(message);// 예외 메시지를 부모 클래스에 전달함
        System.out.println("너 돈 없잖아");
    }
}
