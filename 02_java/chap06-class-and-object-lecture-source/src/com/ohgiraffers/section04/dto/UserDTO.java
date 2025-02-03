package com.ohgiraffers.section04.dto;

public class UserDTO {

    /* 설명: 자바빈(Java Bean) 이란?
     *   JSP에서 사용되는 표준 액션 태그로 접근할 수 있게 만든 자바 클래형태
     *   자바 코드를 모르는 웹 퍼블리셔들도 자바 코드를 사용할 수 있도록 태그 형식으로 지원하는 문법을 의미하는데,
     *   그 때 사용할 수 있도록 규칙을 지정해 놓은 java 클래스를 자바빈 (java bean) 이라고 부른다
     *   지금은 특정 목적 및 프레임워크를 위해 클래스를 작성하는 규칙이라고 보면 된다.*/
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;
}
