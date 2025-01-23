package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void printGugudanFromTwoToNine() {
        printAllGugu();
    }

    private static void printAllGugu() {
        for (int i = 1; i < 10; i++) {
            System.out.println("=======" + i + "단=======");
            printGugudanOf(i);
        }
    }

    private static void printGugudanOf(int i) {
        for (int j = 1; j < 10; j++) {
            System.out.println(i + " * " + j + " = " + (i * j));
        }
    }

    public void printStars() {
        System.out.print("숫자를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            printSpace(number, i);
            printStar(i);
            System.out.println();
        }
    }

    /* 설명: static 함수에서 호출하는 함수는 static 일 필요가 없음*/
    private void printStar(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
    }

    private void printSpace(int number, int i) {
        for (int j = number - i; j >= 1; j--) {
            System.out.print(" ");
        }
    }
}
