package com.ohgiraffers.section01.statement;

import static com.ohgiraffers.commom.JDBCTemplate.close;
import static com.ohgiraffers.commom.JDBCTemplate.getConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Application2 {
    public static void main(String[] args) {
        Connection con=getConnection();
        Statement stmt=null;
        ResultSet rSet=null;

        try {
            stmt=con.createStatement();

            /* 설명: 사용자로부터 사번을 입력받아 사원 조회 */
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("사번을 입력해 주세요: ");
            int empId= Integer.parseInt(br.readLine());
            /* 설명: java에서 쿼리를 작성해 전달하게 될 때는 세미콜론(;)을 생략한다*/
            String qeury="select * from EMPLOYEE where EMP_ID= '"+empId+"'";
            rSet=stmt.executeQuery(qeury);
            if(rSet.next()){
                System.out.println("조회하신 "+empId+"번 사원은 "+rSet.getString("EMP_NAME")+"입니다");
            }else{
                System.out.println("해당 사원은 존재하지 않습니다.");
            }


        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }finally {
            close(rSet);
            close(stmt);
            close(con);
        }
    }
}
