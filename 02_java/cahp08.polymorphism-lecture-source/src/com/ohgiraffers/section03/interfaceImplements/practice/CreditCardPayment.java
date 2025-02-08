package com.ohgiraffers.section03.interfaceImplements.practice;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("You have paid " + amount + " credit cards");
    }
}
