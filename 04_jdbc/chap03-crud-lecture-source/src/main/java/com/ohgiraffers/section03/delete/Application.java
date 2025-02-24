package com.ohgiraffers.section03.delete;

import static com.ohgiraffers.commom.JDBCTemplate.close;
import static com.ohgiraffers.commom.JDBCTemplate.getConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) {
        Connection con=getConnection();
        PreparedStatement pstmt=null;
        int result=0;
        /* 설명: 1. soft delete*/
        String query="UPDATE TBL_MENU SET orderable_status='N' WHERE menu_code=?";

        /* 설명: 2.hard delete*/
//        String query2="DELETE FROM TBL_MENU WHERE MENU_CODE=?";

        try {
            pstmt=con.prepareStatement(query);
            pstmt.setInt(1,3);
            result=pstmt.executeUpdate();
            if(result>0){
                System.out.println("Update successful");
                con.commit();
            }else{
                System.out.println("Update failed");
                con.rollback();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            close(pstmt);
            close(con);
        }
    }
}
