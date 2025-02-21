package com.ohgiraffers.commom;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {

    public static void rollback(Connection con) {
        try {
            if(con!=null)con.rollback();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void commit(Connection con) {
        try {
            if(con!=null)con.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(Statement stmt) {
        try{
            if(stmt!=null)stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(ResultSet rSet) {
        try{
            if(rSet!=null)rSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(Connection con) {
        try{
            if(con!=null)con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() {
        Properties prop=new Properties();
        Connection con;
        try {
            prop.load(
                    new FileReader("src/main/java/com/ohgiraffers/config/config-info.properties")
            );
            String driver=prop.getProperty("driver");
            String url=prop.getProperty("url");
            String user=prop.getProperty("user");
            String password=prop.getProperty("password");

            Class.forName(driver);
            con= DriverManager.getConnection(url, user, password);

            /* 설명: DML(insert, update, delete) 실행 시 커밋을 수동으로 실행하도록 설정*/
            con.setAutoCommit(false);
        } catch (IOException | ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
