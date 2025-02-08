package com.ohgiraffers.section01.polymorphism.practice.test_polymorphism;

public class Application {
    public static void main(String[] args) {
        SupClass subClassMadeByPolymorphism=new SubClass();

        System.out.println(subClassMadeByPolymorphism.name());
    }
}
