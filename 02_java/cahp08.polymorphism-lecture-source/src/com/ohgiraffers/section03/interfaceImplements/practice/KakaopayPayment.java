package com.ohgiraffers.section03.interfaceImplements.practice;

public class KakaopayPayment implements Payment {
    @Override
    public void checkBalance() {
        System.out.println("Kakaopay payment check balance");
    }

    @Override
    public void pay(int amount) {

    }
}
