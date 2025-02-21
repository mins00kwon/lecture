package com.ohgiraffers.section02.prepared;

import static com.ohgiraffers.commom.JDBCTemplate.close;
import static com.ohgiraffers.commom.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application1 {
    public static void main(String[] args) {
        Connection con=getConnection();

        /* 설명: Statement 보다 캐싱을 활용해 실행 속도가 더 빠르다(최초 1번 이후) */
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            pstmt=con.prepareStatement("SELECT EMP_ID, EMP_NAME FROM EMPLOYEE");
            rs=pstmt.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getString("EMP_ID"));
                System.out.print(" ");
                System.out.println(rs.getString("EMP_NAME"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rs);
            close(pstmt);       // pstmt는 stmt의 자식이기 때문에 다형성으로 적용됨
            close(con);
        }
    }
}
