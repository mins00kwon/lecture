package com.ohgiraffers.section02.prepared;

import static com.ohgiraffers.commom.JDBCTemplate.close;
import static com.ohgiraffers.commom.JDBCTemplate.getConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application2 {
    public static void main(String[] args) throws IOException {
        Connection con=getConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("사번을 입력하세요: ");
        String empId= br.readLine();
        System.out.println("퇴사 여부를 입력하세요(Y/N): ");
        String empYn= br.readLine().toUpperCase();

        try {

            /* 설명: PreparedStatement는 Statement와 달리 placeholder(?)를 활용해 나나의 문자열 형태로 작성이 가능하다*/
            ps=con.prepareStatement("SELECT EMP_ID, EMP_NAME from EMPLOYEE WHERE EMP_ID = ? AND ENT_YN = ?");
            ps.setString(1, empId);
            ps.setString(2, empYn);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("조회하신 사원의 사번과 이름은 "+rs.getString("EMP_ID")
                +"번, "+rs.getString("EMP_NAME")+"입니다");
            }
            else {
                System.out.println("조건에 해당하는 사원이 없습니다");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rs);
            close(ps);
            close(con);
        }
    }
}
