package com.ohgiraffers.section02.abstractclass;

public class Phone extends Product{
    public Phone() {
    }

    @Override
    public void abstractMethod() {
        System.out.println("안 뺴먹고 오버라이딩 했슴다");
    }
}
