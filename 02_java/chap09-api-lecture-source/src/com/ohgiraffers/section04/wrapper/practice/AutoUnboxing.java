package com.ohgiraffers.section04.wrapper.practice;

public class AutoUnboxing {
    public static void main(String[] args) {
        Integer A=1;
        int a=A;
        System.out.println(a);
        
        
        Integer B=1;
        System.out.println("A.hashCode() = " + A.hashCode());
        System.out.println("B.hashCode() = " + B.hashCode());
    }
}
