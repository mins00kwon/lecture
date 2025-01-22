package com.ohgiraffers.section05.typecasting;

public class LongToFloat {
    public static void main(String[] args) {
        long longValue = Long.MAX_VALUE;
        System.out.println("longValue = " + longValue);
        float floatValue = Float.MAX_VALUE;
        System.out.println("floatValue = " + floatValue);
        floatValue = longValue;
        System.out.println("floatValue = " + floatValue);

        /* 목차:  */
        /* 목표: */
        /* 설명: */
    }
}
