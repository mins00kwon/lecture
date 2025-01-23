package com.ohgiraffers.section02.looping;

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
}
