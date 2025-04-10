package com.ohgiraffers.section02.abstractclass;

public abstract class Product {
    private int nonStaticField;
    private static  int staticField;

    public Product() {}
    public void nonStaticMethod() {}
    public static void staticMethod() {}

    /* 설명: 추상메소드가 하나라도 있다면 해당 클래스는 추상 클래스가 되어야 한다*/
    /* 설명: 추상메소드가 있는 추상 클래스를 상속받은 클래스는
    *   자식 클래스도 추상화를 하거나
    *   메소드를 오버라이딩 해야 한다*/
    public abstract void abstractMethod();
}
