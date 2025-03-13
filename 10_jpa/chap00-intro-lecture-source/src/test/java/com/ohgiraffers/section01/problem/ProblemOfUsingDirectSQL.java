package com.ohgiraffers.section01.problem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/* 필기: SQL을 직접 썼을 때 발생하는 문제 */
public class ProblemOfUsingDirectSQL {
    private Connection con;

    @BeforeEach
    void setConnection() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cd.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/menudb";
        String user = "root";
        String password = "hosp0316!!";

        Class.forName(driver);
        con = DriverManager.getConnection(url, user, password);
        con.setAutoCommit(false);
    }

    @AfterEach
    void closeConnection() throws SQLException {
        con.rollback();
        con.close();
    }

    /* 설명: JDBC API를 이용해 직접 SQL을 다룰 때 발생할 수 있는 문제점
     *   1. 데이터 변환, SQL 작성, JDBC API 코드 등의 중복 작성 -> (개발 시간 증가, 유지보수성 저하)
     *   2. SQL에 의존하여 개발하게 됨
     *   3. 패러다임 불일치 (객체지향 - 상속, 연관관계, 객체 그래프 탐색, 방향성 등 사용 못함)
     *   4. 동일성 보장 문제가 발생함
     * */

    /* 목차: 1. */
    @DisplayName("직접 SQL을 작성하여 메뉴를 조회할 때 발생하는 문제 확인")
    @Test
    void testDirectSelectSql() throws SQLException {
        //given
        String query = "select menu_code, menu_name, menu_price, category_code, "
                + "orderable_status from tbl_menu";
        //when
        Statement stmt = con.createStatement();
        ResultSet rset = stmt.executeQuery(query);

        List<Menu> menuList = new ArrayList<>();
        while (rset.next()) {
            Menu menu = new Menu();
            menu.setMenuCode(rset.getInt("menu_code"));
            menu.setMenuName(rset.getString("menu_name"));
            menu.setMenuPrice(rset.getInt("menu_price"));
            menu.setCategoryCode(rset.getInt("category_code"));
            menu.setOrderableStatus(rset.getString("orderable_status"));

            menuList.add(menu);
        }
        //then
        Assertions.assertTrue(!menuList.isEmpty());
        if (!menuList.isEmpty()) {
            menuList.forEach(System.out::println);
        }
        rset.close();
        stmt.close();
    }

    /* 목차: 2 */
    @DisplayName("연관된 객체 문제 확인")
    @Test
    void testAssociationObject() throws SQLException {
        // given
        String query = "select a.menu_code, a.menu_name, a.menu_price, b.category_code, "
                + "b.category_name, a.orderable_status "
                + "from tbl_menu a "
                + "join tbl_category b on (a.category_code = b.category_code) ";

        // when
        Statement stmt = con.createStatement();
        ResultSet rset = stmt.executeQuery(query);

        List<MenuAndCategory> menuAndCategories = new ArrayList<>();
        while (rset.next()) {
            MenuAndCategory menuAndCategory = new MenuAndCategory();
            menuAndCategory.setMenuCode(rset.getInt("menu_code"));
            menuAndCategory.setMenuName(rset.getString("menu_name"));
            menuAndCategory.setMenuPrice(rset.getInt("menu_price"));
            menuAndCategory.setCategory(new Category(rset.getInt("category_code"), rset.getString("category_name")));
            menuAndCategory.setOrderableStatus(rset.getString("orderable_status"));

            menuAndCategories.add(menuAndCategory);
        }

        // then
    }
}
