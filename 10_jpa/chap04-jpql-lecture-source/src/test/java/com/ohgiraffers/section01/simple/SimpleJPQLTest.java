package com.ohgiraffers.section01.simple;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.*;
public class SimpleJPQLTest {
    private static EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }

    @BeforeEach
    public void initManager() {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @AfterAll
    public static void closeFactory() {
        entityManagerFactory.close();
    }

    @AfterEach
    public void closeManager() {
        entityManager.close();
    }

    @Test
    public void TypedQuery를_이용한_단일행_단일열_조회_테스트(){
        String jpql = "SELECT menuName FROM menu_section01 WHERE menuCode=7";
        TypedQuery<String> query = entityManager.createQuery(jpql, String.class);
        String resultMenuName=query.getSingleResult();
        System.out.println("resultMenuName = " + resultMenuName);
        Assertions.assertEquals("민트미역국", resultMenuName);
    }

    @Test
    public void Query를_이용한_단일행_단일열_조회_테스트(){
        String jpql = "SELECT menuName FROM menu_section01 WHERE menuCode=7";
        Query query=entityManager.createQuery(jpql);
        Object resultMenuName=query.getSingleResult();
        System.out.println("resultMenuName = " + resultMenuName);
        Assertions.assertEquals("민트미역국", resultMenuName);
    }

    @Test
    public void Query를_이용한_단일행_다중영ㄹ_조회_테스트(){
        String jpql = "SELECT m.menuName, m.menuPrice FROM menu_section01 m WHERE menuCode=7";
        Query query=entityManager.createQuery(jpql);
        List<Object[]> resultColumns=query.getResultList();
        Object[] resultRow=resultColumns.get(0);
        Arrays.stream(resultRow).forEach(System.out::println);

        Assertions.assertTrue(resultRow[0] instanceof String);
        Assertions.assertTrue(resultRow[1] instanceof Integer);
    }
}
