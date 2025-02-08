package com.ohgiraffers.section02.userexception.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter amount to withdraw: ");
        int num= Integer.parseInt(br.readLine());
        BankAccount account=new BankAccount(10000);
        try{
            account.withdraw(num);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
