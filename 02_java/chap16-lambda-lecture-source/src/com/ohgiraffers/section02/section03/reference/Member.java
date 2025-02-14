package com.ohgiraffers.section02.section03.reference;

public class Member {
    private String name;
    public Member() {
        System.out.println("기본 생성자 호출됨");
    }
    public Member(String name) {
        System.out.println("매개변수 생성자 호출됨");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
