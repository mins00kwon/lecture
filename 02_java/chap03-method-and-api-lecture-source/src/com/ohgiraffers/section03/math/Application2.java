package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: 사용자 지정 범위의 난수를 발생시킬 수 있다*/

        /* 설명: 1. 0~9까지의 난수 발생*/
        int result=(int)(Math.random()*10);
        /* 설명: 1. 80~100까지의 난수 발생*/
        int result2=(int)(Math.random()*21+80);
        /* 설명: 1. -188~10까지의 난수 발생*/
        int result3=(int)(Math.random()*199-188);
        // 199를 바로 계산하지 못하더라도 188+1+10 으로 식을 짤 수 있음
        // 암산이 아니라 이런 생각을 해내는게 개발자가 지녀야 할 자세 아닐까
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
