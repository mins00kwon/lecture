package com.ohgiraffers.section03.filterstream.dto;

import java.io.Serializable;

// 질문: 이건 진짜 도대체 뭐임ㅋㅋㅋ
    // 직렬화라는데 직렬화가 뭔데
public class MemberDTO implements Serializable {
    /* 설명: transient 키워드가 달린 필드는 객체 입출력시 (직렬화시 대상이 되지 않는다) 출력 되지 않는다*/
    private transient String asd;
    private String id;
    private String pwd;
    private String name;
    private String email;
    private int age;
    private char gender;

    // region Getter and Setter

    public MemberDTO() {
    }

    public MemberDTO(String id, String pwd, String name, String email, int age,
                     char gender) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    // region

    @Override
    public String toString() {
        return "MemberDTO{" +
                "age=" + age +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    // endregion

    // region Getter and Setter

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    // endregion
}
