package com.ohgiraffers.section01.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import javax.management.MBeanRegistration;

public class Application {
    public static void main(String[] args) throws IOException {
        A_if aClass=new A_if();

        /* 설명: 단독 if문 흐름 확인용 메소드 호출*/
        aClass.testSimpleIfStatement();

        /* 설명: 중첩 if문 흐름 확인용 메소드 호출*/
        aClass.testNestedIfStatement();

        B_ifElse bClass=new B_ifElse();
        /* 설명: 단독 if-else문 흐름 확인용 메소드 호출*/
        bClass.testSimpleIfElseStatement();

        /* 설명: 중첩 if-else문 흐름 확인용 메소드 호출*/
        bClass.testNestedIfElseStatement();

        C_ifElseIf cClass=new C_ifElseIf();

    }

}
