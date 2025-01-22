package com.ohgiraffers.section02.assignment;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 복합대입 연산자를 이해하고 활용할 수 있다*/
        /* 설명:
        *   대입연산자와 산술 복합 대입 연산자
        * '=' '*=' '-=' '/=' /%=' '+='
        * */
        int num=12;
        System.out.println("num = " + num);                 //12
        System.out.println("num++ = " + num++);             //12 13
        System.out.println("num = " + num);                 //13 13
                                                            //13 16
        System.out.println("num+=3 = " + (num += 3)); //라인이 끝나기 전에 실행됨
                                                            //16 17
        System.out.println("num++ = " + (num++));       // 라인이 끝나고 나서 실행됨
    }
}
