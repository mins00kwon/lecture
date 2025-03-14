package com.ohgiraffers.section02.column;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;
public class ColumnMappingTest {
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
    public void 컬럼에서_사용하는_속성_테스트() {
        // given when then
        Member member = new Member();
        member.setMemberNo(52);
        member.setMemberId("eagles52");
        member.setMemberPwd("eagles52");
        member.setNickName("김돗돔");
//        member.setPhone("010-1234-5667");
        member.setEmail("eagles52@gmail.com");
        member.setAddress("대전광역시 한화구");
        member.setEnrollDate(new java.util.Date());
        member.setMemberRole("ROLE_MEMBER");
        member.setStatus("Y");

        // when
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(member);

        // then
        Member foundMember = entityManager.find(Member.class, 52);
        foundMember.setNickName("김도망");
        transaction.commit();
    }
}
