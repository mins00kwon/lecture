package com.ohgiraffers.section02.reflection;

import lombok.ToString;

@ToString
public class Account {
    private String bankCode;
    private String accNo;
    private String accPwd;
    private int balance;

    public Account() {
    }

    public Account(String bankCode, String accNo, String accPwd) {
        this.bankCode = bankCode;
        this.accNo = accNo;
        this.accPwd = accPwd;
    }

    public Account(String bankCode, String accNo, String accPwd, int balance) {
        this(bankCode, accNo, accPwd);
        this.balance = balance;
    }

    /* 설명: 잔액 조회*/
    public String getBalance() {
        return this.accNo + "계좌의 현재 잔액은 "+this.balance+"원 입니다";
    }
    /* 설명: 입금*/
    public String deposit(int money) {
        if(money > 0) {
            return money+"원이 입금되었습니다";
        }else{
            return "금액을 잘못 입력하셨습니다";
        }
    }
    /* 설명: 출금*/
    public String withdraw(int money) {
        if(money > balance) {
            balance-=money;
            return money+"원이 출금되었습니다.";
        }else{
            return "잔액이 부족합니다. 잔액을 확인해주세요";
        }
    }
}
