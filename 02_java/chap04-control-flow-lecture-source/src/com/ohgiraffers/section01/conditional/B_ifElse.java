package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void testSimpleIfElseStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int input = sc.nextInt();
        /* 의사 코드 (Pseudo-cod)
        만약 (홀수라면)
           홀수 출력
       만약 (짝수라면)
            짝수 출력
         */
        if(input %2!=0){
            System.out.println("The number is odd");
        }else {
            System.out.println("The number is even");
        }
    }


    public void testNestedIfElseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int input = sc.nextInt();
        if(input>=0){
            if(input %2==0){
                System.out.println("양수이면서 짝수입니다");
            }
            else {
                System.out.println("양수이면서 홀수입니다");
            }
        }else {
            if(input %2==0){
                System.out.println("음수이면서 짝수입니다");
            }
            else {
                System.out.println("음수이면서 홀수입니다");
            }
        }
    }
}
