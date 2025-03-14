package com.ohgiraffers.section01.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EntityMappingTest {
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
    public void 테이블_만들기_테스트0(){  // 테스트 코드 내에 아무것도 쓰지 않았음에도 테이블이 생성 쿼리가 전송됨
                                    // Member 클래스에 작성해둔걸 바탕으로 날아간건데... 진짜 왜지?
        
    }
    
    @Test
    public void 테이블_만들기_테스트() {
        // given when then
        Member member = new Member();
        member.setMemberNo(52);
        member.setMemberId("eagles52");
        member.setMemberPwd("eagles52");
        member.setNickName("김돗돔");
        member.setPhone("010-1234-5667");
        member.setEmail("eagles52@gmail.com");

        // when
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(member);

        // then
        Member foundMember = entityManager.find(Member.class, 52);
        foundMember.setNickName("김별명");
        transaction.commit();
    }
}
