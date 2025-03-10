package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class Application {
    /* 필기: 이건 머선 설정이고 */
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/menudb";
    private static String user = "root";
    private static String password = "hosp0316!!";

    public static void main(String[] args) {
        /* 설명:
        *   JdbcTransactionFactory: 수동 커밋
        *   ManagedTransactionFactory: 자동 커밋
        *   ----------------------------------------
        *   PooledDataSource: ConnectionPool 사용 -> 나중에 SpringBoot 의 HikariCP 로 대체됨
        *   UnPooledDataSource: ConnectionPool 미사용
        * */
        /* 필기: 이 '환경' 이라는게 뭐임? */
        Environment environment=new Environment(
                "dev",  /* 필기: 우리가 만드는 환경의 이름 */
                 new JdbcTransactionFactory(),  /* 필기: 수동 커밋을 하겠다는 뜻 */
                new PooledDataSource(driver,url,user,password)  /* 필기: 커넥션 객체를 매번 만들지 않겠다는 뜻
                                                                    미리 만들어두고 필요할 때 공금*/
        );
        Configuration configuration=new Configuration(environment);
        configuration.addMapper(Mapper.class); /* 필기: 설계도 (configuration) 에 쿼리(Mapper) 주입 */

        /* 설명:
        *   SqlSessionFactory: SqlSession 객체를 생성하기 위한 팩토리 역할의 인터페이스
        *   SqlSessionFactoryBuilder: SqlSessionFactory 인터페이스 타입의 하위 구현 객체를 생성하기 위한 빌드 역할
        *   build(): 설정에 대한 정보를 담고 있는 Configuration 타입의 객체(java방식) 혹은 외부 설정 파일과 연결된
        *           stream을 매개변수로 전달(xml 방식)하면 SQLSessionFactory 인터페이스 타입의 객체를 반환하는 메소드*/

        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(configuration); /* 필기: 일꾼(Builder) 한테 설계도 주고 공장(Factory) 만들라고 지시 */
        SqlSession session=sqlSessionFactory.openSession(false); /* 설명: false 를 작성해야 수동커밋 완성*/
        Mapper mapper=session.getMapper(Mapper.class);

        java.util.Date date=mapper.selectNow();
        System.out.println("date = " + date);
        session.close();
    }
}
