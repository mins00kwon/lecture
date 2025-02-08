package com.ohgiraffers.section01.exception.practice;

/* 설명: 예외 처리를 하면 예외로 인해 프로그램이 종료되지 않음*/
public class BasicException {
    public static void main(String[] args) {
        try{
            int a=1/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("finally");
        }
    }
}
