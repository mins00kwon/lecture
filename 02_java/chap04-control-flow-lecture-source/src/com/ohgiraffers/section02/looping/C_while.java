package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {
    public void testSimplewhileStatement() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        /* 설명: while 은 주로 사용자의 입력값에 따라 반복 횟수가 정해지는 형태에서 쓰인다*/
        /* 설명: 내 버전: 사용자의 입력이 특정 조건을 만족할 때 종료가 되는 형태*/
    }

    public void testWhileExample() {
        Scanner scanner = new Scanner(System.in);
        /* 설명: 'y' 또는 'Y'를 입력하면 반복을 종료*/
        char c;
        while (true) {
            System.out.print("Enter y or Y to quit: ");
            c = scanner.nextLine().charAt(0);
            if (c == 'y' || c == 'Y') {
                break;
            }
        }
        System.out.println("프로그램을 종료합니다");
    }
}
