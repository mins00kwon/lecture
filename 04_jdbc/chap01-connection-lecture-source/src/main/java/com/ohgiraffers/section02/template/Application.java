package com.ohgiraffers.section02.template;

import static com.ohgiraffers.section02.template.JDBCTemplate.close;
import static com.ohgiraffers.section02.template.JDBCTemplate.getConnection;

import java.sql.Connection;

/* 설명: 다른 클래스의 static 메소드를 클래스명을 쓰지 않고 메소드만 호출하려면
*   import static을 한다*/
public class Application {
    public static void main(String[] args) {
        Connection con=getConnection();
        System.out.println("con = " + con);

        /* 설명: 비즈니스 로직(트랜잭션 관련) 실행*/
        System.out.println("Connection 객체를 활용해 DB와 SQL로 소통");

        close(con);
    }
}
