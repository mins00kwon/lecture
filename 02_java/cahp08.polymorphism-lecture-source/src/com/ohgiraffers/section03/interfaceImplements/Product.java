package com.ohgiraffers.section03.interfaceImplements;

public class Product implements InterProduct{

    @Override
    public void nonStaticMethod(){
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩 메소드");
    }

    @Override
    public void method() {
        InterProduct.super.method();
    }
}
