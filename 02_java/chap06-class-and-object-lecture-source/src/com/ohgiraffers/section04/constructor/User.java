package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class User {
    // 여기를 '필드' 라고 부름
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /* 설명: 기본 생성자(매개변수가 없는)를 활용한 객체 생성
     *   자바가 자동으로 만들어준다고 안심하지 말고
     *   중요: 반드시 명시적으로 쓰자!*/
    public User() {
        System.out.println("기본 생성자 호출");
    }

    /* 설명: 단축키
     *   Cmd+N
     *   Constructor*/

    /* 설명: 원하는 핃드를 초기화 하기 위한 매개변수 있는 생성자를 활용해 객체를 생성할 수 있다.*/
    public User(String id, String pwd, String name) {
        /* 설명:
         *   생성자 안에서의 this. 은 이 생성자로 만들어질 객체에 접근하는 것이다.*/
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        System.out.println("매개변수 생성자 호출");
    }

    public User(String id, String pwd, String name, Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
        /* 설명: 기존에 작성한 생성자를 호출
                그러니 당연히 위 생성자의 출력 함수도 호출됨
         *   목적: 반복되는 코드를 줄임*/

        /* 설명: this()는 항상 첫 줄에 작성되어야 하며, 2개 이상 작성할 수 없다*/
        this(id, pwd, name);
        this.enrollDate = enrollDate;
    }

    public String information() {
        return "id: " + this.id + ", pwd: " + this.pwd + ", name: " + this.name + ", enrollDate: " + this.enrollDate;
    }
}
