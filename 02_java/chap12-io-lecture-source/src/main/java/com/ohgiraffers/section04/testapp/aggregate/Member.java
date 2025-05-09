package com.ohgiraffers.section04.testapp.aggregate;

import java.io.Serializable;
import java.util.Arrays;

public class Member implements Serializable {
    private int memNo;                     // 번호
    private String id;                     // 아이디
    private String pwd;                    // 비번
    private int age;                       // 나이
    private String[] hobbies;              // 취미들
    private BloodType bloodType;           // 혈액형
    private AccountStatus accountStatus;   // 활성화여부


    public Member() {
    }

    public Member(Member member) {
        this.memNo = member.getMemNo();
        this.id = member.getId();
        this.pwd = member.getPwd();
        this.age = member.getAge();
        this.hobbies = member.getHobbies().clone();
        this.bloodType = member.getBloodType();
        this.accountStatus = member.getAccountStatus();
    }

    /* 설명. 회원가입 시 입력받은 5개의 값으로 초기화하는 생성자 */
    public Member(String id, String pwd, int age, String[] hobbies, BloodType bloodType) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
    }

    public Member(int memNo, String id, String pwd, int age, String[] hobbies, BloodType bloodType,
                  AccountStatus accountStatus) {
        this.memNo = memNo;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
        this.accountStatus = accountStatus;
    }

    public int getMemNo() {
        return memNo;
    }

    public void setMemNo(int memNo) {
        this.memNo = memNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memNo=" + memNo +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", bloodType=" + bloodType +
                ", accountStatus=" + accountStatus +
                '}';
    }
}
