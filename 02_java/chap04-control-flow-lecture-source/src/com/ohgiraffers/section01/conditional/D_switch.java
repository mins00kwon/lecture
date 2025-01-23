package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("등급을 입력하세요 (G / S / B): ");
        char grade = scanner.next().charAt(0);           // 스캐너는 String을 물어오니까 char로 바꿔줘야함
        System.out.println("grade = " + grade);
        int point = 0;
        boolean flag = true;
        switch (grade) {
            case 'G':
                point += 10;
            case 'S':
                point += 10;
            case 'B':
                point += 10;
                break;
            default:
                flag = false;
                System.out.println("잘못된 입력입니다");
        }
        if (flag) {
            System.out.println("당신의 등급은 " + grade + "이고, 누적 포인트는 " + point + "입니다.");
        } else {
            System.out.println("프로그램을 다시 실행해주세요.");
        }
        /* 설명: if를 활용한 조건문에서 실행 구문이 하나면 {} 생략 가능*/

    }
}
