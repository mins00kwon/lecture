package com.ohgiraffers.commom;

public interface Account {
    /* 설명: 잔액 조회*/
    String getBalance();
    /* 설명: 입금*/
    String deposit(int money);
    /* 설명: 출금*/
    String withdraw(int money);
}
