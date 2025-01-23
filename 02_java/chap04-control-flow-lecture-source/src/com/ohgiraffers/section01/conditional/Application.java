package com.ohgiraffers.section01.conditional;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        A_if aClass = new A_if();

        /* 설명: 단독 if문 흐름 확인용 메소드 호출*/
//        aClass.testSimpleIfStatement();

        /* 설명: 중첩 if문 흐름 확인용 메소드 호출*/
//        aClass.testNestedIfStatement();

        B_ifElse bClass = new B_ifElse();
        /* 설명: 단독 if-else문 흐름 확인용 메소드 호출*/
//        bClass.testSimpleIfElseStatement();

        /* 설명: 중첩 if-else문 흐름 확인용 메소드 호출*/
//        bClass.testNestedIfElseStatement();

        C_ifElseIf cClass = new C_ifElseIf();
        /* 설명: 단순 if-else 문 흐름 확인용 메소드 호출*/
//        cClass.testSimpleIfElseIfStatement();
        /* 설명: 중첩 if-else문 흐름 확인용 메소드 호출*/
//        cClass.testNestedIfElseIfStatement();

        D_switch dClass = new D_switch();
//        dClass.testSimpleSwitchStatement();

    }

}
