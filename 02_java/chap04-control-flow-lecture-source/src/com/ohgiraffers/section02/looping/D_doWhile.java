package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {

    public void sumPrice() {
        int sumPrice = 0;
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("sumPrice 에 담을래 뺼래?");
            System.out.println("1. 담을래(+1000)");
            System.out.println("2. 뺄래(+1000)");
            System.out.println("3. 나갈래");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                sumPrice = sumPrice + 1000;
            } else if (choice == 2) {
                sumPrice = sumPrice - 1000;
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        } while (choice < 3);
    }
}
