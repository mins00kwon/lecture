package com.ohgiraffers.section05.parameter;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    public void calArea() {
        System.out.println("Area of Rectangle is " + width * height);
    }

    public void calRound() {
        System.out.println("Round of Rectangle is " + (width + height) * 2);
    }
}
