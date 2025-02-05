package com.ohgiraffers.section03.overriding;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        SuperClass superClass2 = new SuperClass();
        System.out.println(superClass.equals(superClass2));
    }
}
