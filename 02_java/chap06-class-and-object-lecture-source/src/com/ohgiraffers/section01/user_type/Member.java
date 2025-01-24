package com.ohgiraffers.section01.user_type;


/* 설명: 여러 타입의 값들을 저장할 수 있는 단위(클래스의 일부분인 내용이자 C++의 구조체적인 개념)*/
/* 설명: 하나의 객체를 만들어 내기 위한 도구*/
/* 설명: 사용자 정의형 타입*/
public class Member {
    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] hobbies;

    public static void printMember(Member member) {
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);
        System.out.println("member.id = " + member.id);

    }
}
