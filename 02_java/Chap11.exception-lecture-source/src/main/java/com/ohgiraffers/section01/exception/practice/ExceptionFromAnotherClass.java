package com.ohgiraffers.section01.exception.practice;

public class ExceptionFromAnotherClass {
    public static void main(String[] args) {
        Calcualator calcualator = new Calcualator();
        calcualator.divideNoException(1,0); // 그냥 에러 발생
        calcualator.divideWithException(2,0); // 그냥 에러 발생
        calcualator.divideFullyException(2,0);  // 예외처리가 되어있으므로 예외가 발생하지 않음
    }
}
