package com.ohgiraffers.section03.sqlInjection;

import static com.ohgiraffers.commom.JDBCTemplate.close;
import static com.ohgiraffers.commom.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application2 {
    private static String empId="200";
    private static String empName="'OR 1=1 AND EMP_ID='200";
    public static void main(String[] args) {
        Connection con = getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        /* 설명:
        * 아래 sql과 같이 PreparedStatement는 Placeholder로 입력되는 값에 single Quotation이 있다면
        * Single Quotation을 하나 더 이어 붙이고 양 옆에도 single quoatation을 붙여준
        * 이를 통해 SQL Injection 공격을 막아준다
        * */
        try {
            ps=con.prepareStatement("select * from EMPLOYEE where EMP_ID = ? AND EMP_NAME=?");
            ps.setString(1, empId);
            ps.setString(2, empName);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("EMP_NAME"));
            }else {
                System.out.println("No employee found");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            close(rs);
            close(ps);
            close(con);
        }

    }
}
