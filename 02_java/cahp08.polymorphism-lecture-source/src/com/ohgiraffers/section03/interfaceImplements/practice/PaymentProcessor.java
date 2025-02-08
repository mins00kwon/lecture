package com.ohgiraffers.section03.interfaceImplements.practice;

public class PaymentProcessor {
    public void processPayment(Payment payment, int amount) {
        payment.pay(amount);
    }
}
