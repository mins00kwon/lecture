package com.ohgiraffers.section06.singleton;

public class EagerSingleton {
    private static EagerSingleton eager = new EagerSingleton();

    /* 설명: 다른 곳에서는 못만들게 막아버림*/
    private EagerSingleton() {
        System.out.println("EagerSingleton constructor");
    }

    public static EagerSingleton getInstance() {
        return eager;
    }
}
