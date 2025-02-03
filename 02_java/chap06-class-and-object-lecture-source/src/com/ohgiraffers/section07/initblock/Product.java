package com.ohgiraffers.section07.initblock;

public class Product {
    private String name = "아이폰";
    private int price;
    private static String brand;

    {
        System.out.println("나도 있어....");
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
