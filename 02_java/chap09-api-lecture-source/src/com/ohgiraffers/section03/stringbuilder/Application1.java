package com.ohgiraffers.section03.stringbuilder;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: String과 StringBuilder의 차이점에 대해 이해하고 사용할 수 있다*/
        StringBuilder sb=new StringBuilder("Java");

        String testStr="java";
        StringBuilder testSb=new StringBuilder("kotlin");

        for(int i=0;i<9;i++){
            System.out.println(i);
            testStr+=i;
            testSb.append(i);

            System.out.println("System.identityHashCode(testStr) = " + System.identityHashCode(testStr));
            System.out.println("System.identityHashCode(testSb) = " + System.identityHashCode(testSb));
            System.out.println("");
        }
        System.out.println("testStr = " + testStr);
        System.out.println("testSb = " + testSb);
    }
}
