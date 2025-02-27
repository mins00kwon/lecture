package com.ohgiraffers.listener.section01.section02.sessionlistner;

import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionBindingListener;

public class UserDTO implements HttpSessionBindingListener {
    private String name;
    private int age;

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("UserDTO 객체가 담김");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("UserDTO 객체가 제거됨");
    }

    // region toString Constructor getter setter

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public UserDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // endregion
}
