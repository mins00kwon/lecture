package com.ohgiraffers.section01.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A_if {


    public void testSimpleIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
      //만약에(입력 받은 값이 짝수면){
     //   "짝수입니다." 를 출력
    //  }
        /* 설명: 먼저 전략을 짜고 들어가자*/
        if (input%2 == 0) {
            System.out.println("짝수 입니다");
        }else {
            System.out.println("홀수 입니다");
        }
    }

    public void testNestedIfStatement() {
        System.out.print("Enter a positive number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input>0){
            if(input%2==0){
                System.out.println("입력 받은 값은 양수이면서 짝수입니다");
            }
            else{
                System.out.println("입력 받은 값은 양수이면서 홀수입니다");
            }
        }else {
            if(input%2==0){
                System.out.println("입력 받은 값은 음수이면서 짝수입니다");
            }
            else{
                System.out.println("입력 받은 값은 음수이면서 홀수입니다");
            }
        }
    }
}
