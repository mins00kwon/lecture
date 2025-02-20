package com.ohgiraffers.section01.Jupiter;

public class NumberValidator {
    public void checkDividableNumbers(int firstNum, int secondNum) {
        if(secondNum == 0) {
            /* 필기: 매개변수가 잘못되었을 때 주로 사용하는 예외 */
            throw new IllegalArgumentException("0으로 나눌 수 없습니다");
        }
    }
}
