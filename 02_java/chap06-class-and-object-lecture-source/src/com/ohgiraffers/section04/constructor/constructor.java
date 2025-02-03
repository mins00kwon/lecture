package com.ohgiraffers.section04.constructor;

public class constructor {
    public static void main(String[] args) {
        /* 목표: 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다*/
        User user1 = new User();
        User user2 = new User("1234", "abcd", "Gil");
        User user3 = new User("Hong", "asdf", "Gildong", new java.util.Date());
        System.out.println(user3.information());
    }
}
