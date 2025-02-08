package com.ohgiraffers.section03.interfaceImplements.practice;

public interface Payment {
    void pay(int amount);
    static void announce(int amount) {
        System.out.println("announced " + amount);
    }
    default void checkBalance() {
        System.out.println("check balance");
    }
}
