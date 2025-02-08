package com.ohgiraffers.section02.string.practice;

public class StringMethods {
    public static void main(String[] args) {
        String str1="Hello World";
        String str2;

        /* 설명: charAt 싧습*/
        str2=str1.charAt(0)+"";             // +"" 하면 자동으로 대입은 되지 않음

        /* 설명: compareTo() 실습*/
        System.out.println("str1 = " + str1);
        str2=str1.toUpperCase();
        System.out.println("str2 = " + str2);
        System.out.println(str1.compareTo(str2));
        
        str1="ABCDEFG";
        str2="ACDEFG";
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str1.compareTo(str2) = " + str1.compareTo(str2));

    }
}
