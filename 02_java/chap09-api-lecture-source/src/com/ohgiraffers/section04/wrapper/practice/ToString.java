package com.ohgiraffers.section04.wrapper.practice;

public class ToString {

    public static void main(String[] args) {

    int a=1;
    Integer A=a;
    String strA=Integer.toString(a);
    String StrB=Integer.valueOf(a).toString();
    String StrC=A.toString();
    String StrD=A+"";
    System.out.println(strA);
    }
}
