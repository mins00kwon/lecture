package com.ohgiraffers.section01.insert;

import static com.ohgiraffers.commom.JDBCTemplate.close;
import static com.ohgiraffers.commom.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application1 {
    public static void main(String[] args) {
        Connection con=getConnection();
        PreparedStatement pstmt=null;
        /* 설명:
        *   DML(Insert, Update, Delete) 작업 시에는 반환 결과가 int 값이 된다
        *   그리고 조회에서는 executeQury()를 썼다면 DML에서는 executeUpdate() 를 쓴다
        * */
        int result=0;
        String query="insert into tbl_menu\n"
                + "(menu_name,menu_price,category_code,orderable_status)\n"
                + "values\n"
                + "    (?,?,?,?)";
        try {
            pstmt=con.prepareStatement(query);
            pstmt.setString(1,"치약맛치즈");
            pstmt.setInt(2,20000);
            pstmt.setInt(3,7);
            pstmt.setString(4,"Y");
            result=pstmt.executeUpdate();
            /* 설명:
            *   잘못 작성된 부분 삭제
            *   delete from tbl_menu where menu_code > 24
            *
            *   재가 발생하고자 하는 번호로 초기화
            *   alter table tbl_menu auto_increment = 24;
            * */
            if(result>0){
                System.out.println("insert 결과: "+result+" 행이 추가됨");

                /* 설명: JDBCTemplate에 setAUtoCommit(false) 설정할 것*/
                con.commit();
            }else{
                System.out.println("insert 실패");
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
