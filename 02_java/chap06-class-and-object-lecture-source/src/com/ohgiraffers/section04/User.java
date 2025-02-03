package com.ohgiraffers.section04;

public class User {
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /* 설명: 기본 생성자(매개변수가 없는)를 활용한 객체 생성
     *   자바가 자동으로 만들어준다고 안심하지 말고
     *   중요: 반드시 명시적으로 쓰자!*/
    public User() {

    }

    public String information() {
        return "id: " + this.id + ", pwd: " + this.pwd + ", name: " + this.name + ", enrollDate: " + this.enrollDate;
    }
}
