package com.ohgiraffers.section01.polymorphism.practice.test_polymorphism;

public class SubClass extends SupClass{
    public String name = "SubClass";

    public String name(){return this.name;}

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
