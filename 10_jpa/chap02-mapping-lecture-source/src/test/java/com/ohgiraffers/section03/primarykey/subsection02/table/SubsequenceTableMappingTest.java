package com.ohgiraffers.section03.primarykey.subsection02.table;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubsequenceTableMappingTest {
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
    public void 식별자_매핑_테스트() {
        // region 멤버1 생성 및 정보 입력
        Member member = new Member();
//        member.setMemberNo(52);
        member.setMemberId("eagles52");
        member.setMemberPwd("eagles52");
        member.setNickName("김돗돔");
        member.setPhone("010-1234-5667");
        member.setEmail("eagles52@gmail.com");
        member.setAddress("대전광역시 한화구");
        member.setEnrollDate(new java.util.Date());
        member.setMemberRole("ROLE_MEMBER");
        member.setStatus("Y");
        // endregion
        // region 멤버2 생성 및 정보 입력
        Member member2 = new Member();
//        member2.setMemberNo(52);
        member2.setMemberId("user02");
        member2.setMemberPwd("mlb");
        member2.setNickName("류현진");
        member2.setPhone("010-1113-5667");
        member2.setEmail("eagles92@gmail.com");
        member2.setAddress("캘리포니아시 LA구");
        member2.setEnrollDate(new java.util.Date());
        member2.setMemberRole("ROLE_ADMIN");
        member2.setStatus("Y");
        // endregion

        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(member);
        entityManager.persist(member2);
        transaction.commit();

        /* 설명: persist 당시에는 부여되지 않은 pk 값으로 commit 이후 조회를 하면 조회가 될까? */
        Member selectedMember = entityManager.find(Member.class, 1);
        System.out.println("selectedMember: "+selectedMember);

        Assertions.assertEquals(1, selectedMember.getMemberNo());
    }
}
