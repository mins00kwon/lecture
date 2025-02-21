package com.ohgiraffers.section03.sqlInjection;

import static com.ohgiraffers.commom.JDBCTemplate.close;
import static com.ohgiraffers.commom.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Application1 {
    private static String empId="200";
    private static String empName="'OR 1=1 AND EMP_ID='200";
    public static void main(String[] args) {
        Connection con = getConnection();
        Statement stmt = null;
        ResultSet rs = null;

        String query="SELECT * FROM EMPLOYEE WHERE EMP_ID = '"+empId+"'"
                + " AND EMP_NAME = '"+empName+"'";
        System.out.println("query = " + query);


        try {
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
            if(rs.next()){
                System.out.println(rs.getString("EMP_NAME")+"님 환영합니다.");
            }else{
                System.out.println("해당 회원은 존재하지 않습니다.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rs);
            close(stmt);
            close(con);
        }
    }
}
