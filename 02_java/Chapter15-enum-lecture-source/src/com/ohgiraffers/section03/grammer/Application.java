package com.ohgiraffers.section03.grammer;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        UserRole1 admin=UserRole1.ADMIN;
        System.out.println(admin.name());
        System.out.println(admin.getNameToLowerCase());

        UserRole2 consumer=UserRole2.CONSUMER;
        System.out.println(consumer.name());
        System.out.println(consumer.ordinal());
        System.out.println(consumer.getDescription());

        /* 설명: Set의 개념으로 활용할 수도 있다
        *       Iterator를 활용할 수 있다*/
        System.out.println("Set으로 바꿔 반복자를 활용해보자");
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iterator = roles.iterator();
        while (iterator.hasNext()) {
            UserRole2 role = iterator.next();
        }
    }
}
