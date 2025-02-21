package com.ohgiraffers.section01.statement;

import static com.ohgiraffers.commom.JDBCTemplate.close;
import static com.ohgiraffers.commom.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Application1 {
    public static void main(String[] args) {
        /* 설명: Connection 객체 생성 */
        Connection con=getConnection();
        System.out.println("con = " + con);

        Statement stmt=null;

        /* 설명: 실행될 쿼리가 조회일 경우*/
        ResultSet rSet=null;        // 조회를 하고 올것이라는 뜻

        try {
            stmt=con.createStatement(); // 이게 트럭을 만드는 과정이라고 하심
            rSet=stmt.executeQuery("select * from employee");   // 반복문 외부에서의 rSet은 다중행을 의미한다
            /* 설명: 다중행 결과는 반복문 활용*/
            while(rSet.next()) {
                /* 설명: 반복문 안에서의 rSet은 한 행을 의미한다*/
                System.out.println(rSet.getString("EMP_NAME")+", "
                +rSet.getString("SALARY"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            // 닫는 순서는 만든 순서와 반대로 해야함
            close(rSet);
            close(stmt);
            close(con);
        }
    }
}
