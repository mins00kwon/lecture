package com.ohgiraffers.section03.interfaceImplements.practice;

public class PaypalPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paypal Payment is executed with amount " + amount);
    }
}
