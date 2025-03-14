package com.ohgiraffers.section04.enumtype;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;
public class EnumTypeMappingTest {
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
    public void enum타입_매핑_테스트(){
        // region Member 생성 및 정보 입력
        Member member = new Member();
        member.setMemberNo(52);
        member.setMemberId("eagles52");
        member.setMemberPwd("eagles52");
        member.setNickName("김돗돔");
        member.setPhone("010-1234-5667");
        member.setEmail("eagles52@gmail.com");
        member.setAddress("대전광역시 한화구");
        member.setEnrollDate(new java.util.Date());
        member.setMemberRole(RoleType.ROLE_MEMBER);
        member.setStatus("Y");
        // endregion

        entityManager.getTransaction().begin();
        entityManager.persist(member);
        entityManager.getTransaction().commit();
        Member selectedMember = entityManager.find(Member.class, 52);

        // region 출력 확인 코드
        System.out.println("====================");
        System.out.println("====================");
        System.out.println("====================");
        System.out.println("====================");
        System.out.println("====================");
        System.out.println("====================");
        System.out.println("selectedMember = " + selectedMember);
        // endregion
        entityManager.close();
        Assertions.assertEquals(selectedMember, member);
    }
}
