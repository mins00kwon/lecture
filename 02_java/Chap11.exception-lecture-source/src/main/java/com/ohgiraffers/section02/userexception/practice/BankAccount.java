package com.ohgiraffers.section02.userexception.practice;

public class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > this.balance) {
            throw new InsufficientBalanceException("Insufficient balance.\n"
                    + "Current balance: " + this.balance);
        }else{
            this.balance -= amount;
            System.out.println("Withdraw amount : " + amount);
            System.out.println("Current balance: " + this.balance);
        }
    }
}
