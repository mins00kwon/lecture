package com.ohgiraffers.section01.insert;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/* 설명: 넘어온 Connection 객체를 활용해 자신이 알고있는 쿼리로 CRUD 실행하고 그 결과를 반환*/
public class MenuRepository {

    public int insertMenu(Connection con, Menu menu) {
        PreparedStatement preparedStatement = null;
        int result = 0;
        /* 설명: 쿼리는 xml 파일로부터 읽어와서 활용할 것
        *   'mapper 파일'*/
        Properties prop=new Properties();
        try {
            prop.loadFromXML(
                    new FileInputStream("src/main/java/com/ohgiraffers/section01/insert/mapper/menu-mapper.xml")
            );
            String query=prop.getProperty("insertMenuQuery");
            preparedStatement=con.prepareStatement(query);
            preparedStatement.setString(1, menu.getMenuName());
            preparedStatement.setInt(2,menu.getMenuPrice());
            preparedStatement.setInt(3,menu.getCategoryCode());
            preparedStatement.setString(4, menu.getOrderableStatus());
            result = preparedStatement.executeUpdate();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
