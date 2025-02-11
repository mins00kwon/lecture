package com.ohgiraffers.section03.grammer;

public class Application {
    public static void main(String[] args) {
        UserRole1 admin=UserRole1.ADMIN;
        System.out.println(admin.name());
        System.out.println(admin.getNameToLowerCase());
    }
}
