package com.ohgiraffers.section07.initblock;

public class Product {
    private String name = "아이폰";
    private int price;
    private static String brand;

    /* 설명: 초기화 블럭은 생성자 이전에 실행되며 어떤 생성자로 객체를 생성하던 공통적인 로직이 있다면 작성*/
    /* 설명: 인스턴스 초기화 블럭*/ {
        System.out.println("나도 있어....");
    }

    /* 설명: static 초기화 블럭*/
    /* 설명: static 초기화 블럭은 순서와 상관 없이 먼저 실행됨*/
    static {
//        price=200;    // static 초기화 블럭에서는 인스턴스 변수에 접근이 불가능
        Product.brand = "LG";
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
