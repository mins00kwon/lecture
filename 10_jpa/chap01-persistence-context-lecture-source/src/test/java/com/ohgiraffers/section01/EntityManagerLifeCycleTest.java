package com.ohgiraffers.section01;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EntityManagerLifeCycleTest {
    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }

    @BeforeEach
    public void initManager() {
        /* 설명: EntityManager가 생성될 때 마다 고유의 새로운 영속성 컨텍스트(Entity 를 관리하는 자바의 창고)가 생성된다. */
        entityManager = entityManagerFactory.createEntityManager();
    }
    
    @AfterEach
    public void closeManager() {
        entityManager.close();
    }
    @AfterAll
    public static void closeFactory() {
        entityManagerFactory.close();
    }
    
    @Test
    public void 엔티티_매니저_팩토리와_엔티티_매니저_생명주기_확인_1() {
        System.out.println("entityManagerFactory.hashCode1 = " + entityManagerFactory.hashCode());
        System.out.println("entityManager.hashCode1 = " + entityManager.hashCode());
    }
    @Test
    public void 엔티티_매니저_팩토리와_엔티티_매니저_생명주기_확인_2() {
        System.out.println("entityManagerFactory.hashCode2 = " + entityManagerFactory.hashCode());
        System.out.println("entityManager.hashCode2 = " + entityManager.hashCode());
    }
}
