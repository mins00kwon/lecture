package com.ohgiraffers.section01.exception.practice;

public class Calcualator {
    public int divideNoException(int dividend, int divisor) {
        return dividend / divisor;
    }

    public int divideWithException(int dividend, int divisor) throws ArithmeticException {
        return dividend / divisor;
    }

    public int divideFullyException(int dividend, int divisor) throws ArithmeticException {
        try{
            return dividend / divisor;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
//            return 0;
        }finally {
            return 0;
        }
    }
}
