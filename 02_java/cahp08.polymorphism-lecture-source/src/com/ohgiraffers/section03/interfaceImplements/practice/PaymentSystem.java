package com.ohgiraffers.section03.interfaceImplements.practice;

public class PaymentSystem {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        KakaopayPayment kakaopayPayment = new KakaopayPayment();
        PaypalPayment paypalPayment = new PaypalPayment();

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.processPayment(creditCardPayment,100);
        paymentProcessor.processPayment(kakaopayPayment,140);
        paymentProcessor.processPayment(paypalPayment,200);

        System.out.println("===================");
        Payment creditCardPayment1=new CreditCardPayment();
        Payment kakaopayPayment1=new KakaopayPayment();
        Payment paypalPayment1=new PaypalPayment();
        paymentProcessor.processPayment(creditCardPayment1,100);
        paymentProcessor.processPayment(kakaopayPayment1,140);
        paymentProcessor.processPayment(paypalPayment1,200);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
        kakaopayPayment.checkBalance();
        paypalPayment.checkBalance();
    }
}
