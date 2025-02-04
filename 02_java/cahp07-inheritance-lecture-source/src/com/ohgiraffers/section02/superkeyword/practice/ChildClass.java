package com.ohgiraffers.section02.superkeyword.practice;

public class ChildClass extends ParentClass {
    private String lastName="Max";

    public void getFullName(){
        System.out.println(super.getFirstName()+" "+this.lastName);
    }
}
