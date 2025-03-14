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
        Assertions.assertTrue(!menuAndCategories.isEmpty());
        menuAndCategories.forEach(System.out::println);
        rset.close();
        stmt.close();
    }
    /* 목차. 3. 패러다임 불일치(상속, 연관관계, 객체 그래프 탐색, 방향성) */
    /* 설명. 3-1. 상속 문제
     *  객체 지향 언어의 상속 개념과 유사한 것이 데이터베이스의 서브타입엔티티이다.(서브타입을 별도의 클래스로 나뉘었을 때)
     *  슈퍼타입의 모든 속성을 서브타입이 공유하지 못하여 물리적으로 다른 테이블로 분리가 된 형태이다.
     *  (설계에 따라서는 하나의 테이블로 속성이 추가되기도 한다.)
     *  하지만 객체지향의 상속은 슈퍼타입의 속성을 공유해서 사용하므로 여기에서 패러다임의 불일치가 발생한다.
     * */

    /* 설명. 3-2. 연관관계 문제, 객체 그래프 탐색 문제, 방향성 문제
     *  객체지향에서 말하는 가지고 있는(ASSOCIATION 연관관계 혹은 COLLECTION 연관관계) 경우 데이터베이스 저장 구조와
     *  다른 형태이다.
     *
     * 설명.
     *  - 데이터베이스 테이블에 맞춘 객체 모델
     *  public class Menu {
     *    private int menuCode;
     *    private String menuName;
     *    private int menuPrice;
     *    private int categoryCode;
     *    private String orderableStatus;
     *  }
     *  - 객체 지향 언어에 맞춘 객체 모델
     *  public class Menu {
     *    private int menuCode;
     *    private String menuName;
     *    private int menuPrice;
     *    private Category category;
     *    private String orderableStatus;
     *  }
     *
     * */
    /* 목차: 4. 동일성 보장 문제 */
    @DisplayName("조회한 두 개의 행을 담은 객체의 동일성 비교 테스트")
    @Test
    void testEquals() throws SQLException {

        // given
        String query = "select menu_code, menu_name"
                + "from tbl_menu"
                + "where menu_code =12";

        // when
        Statement stmt1 = con.createStatement();
        ResultSet rset1 = stmt1.executeQuery(query);
        Menu menu1 = null;
        while (rset1.next()) {
            menu1 = new Menu();
            menu1.setMenuCode(rset1.getInt("menu_code"));
            menu1.setMenuName(rset1.getString("menu_name"));
        }

        Statement stmt2 = con.createStatement();
        ResultSet rset2 = stmt2.executeQuery(query);
        Menu menu2 = null;
        while (rset2.next()) {
            menu2 = new Menu();
            menu2.setMenuCode(rset2.getInt("menu_code"));
            menu2.setMenuName(rset2.getString("menu_name"));
        }
        // then
        Assertions.assertNotEquals(menu1, menu2);
        rset1.close();
        stmt1.close();
        rset2.close();
        stmt2.close();
    }
}
