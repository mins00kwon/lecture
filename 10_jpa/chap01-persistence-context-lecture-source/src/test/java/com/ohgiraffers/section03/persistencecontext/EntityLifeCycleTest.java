package com.ohgiraffers.section03.persistencecontext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;
public class EntityLifeCycleTest {
    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }

    @BeforeEach
    public void initManager() {

        /* 설명. EntityManager가 생성될 때마다 고유의 새로운 영속성 컨텍스트(Entity를 관리하는 자바의 창고)가 생성된다. */
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

    /* 설명:
    *   영속성 컨텍스트는 엔티티 매니저가 엔티티 객체를 저장하는 공간으로 엔티티 객체를 보관하고 관리한다.
    *   엔티티 매니저가 생성될 때 하나의 영속성 컨텍스트가 할당된다
    *
    * 설명:
    *   엔티티의 생명 주기
    *   비영속, 영속, 준영속, 삭제 상태*/

    @Test
    public void 비영속성_테스트(){
        Menu foundMenu=entityManager.find(Menu.class, 11);

        /* 설명: 비영속 상태의 newMenu*/
        Menu newMenu=new Menu();
        newMenu.setMenuCode(foundMenu.getMenuCode());
        newMenu.setMenuName(foundMenu.getMenuName());
        newMenu.setMenuPrice(foundMenu.getMenuPrice());
        newMenu.setCategoryCode(foundMenu.getCategoryCode());
        newMenu.setOrderableStatus(foundMenu.getOrderableStatus());

        Assertions.assertFalse(foundMenu==newMenu); // 동등하지만 동일하지는 않다
    }

    @Test
    public void 영속성_테스트(){

        Menu foundMenu1=entityManager.find(Menu.class, 11);/* 필기: DB에서 불러와서 Entity Context에 담음 */
        Menu foundMenu2=entityManager.find(Menu.class, 11);/* 필기: Entity Context에서 조회함 */

        Assertions.assertTrue(foundMenu1==foundMenu2);
    }

    @Test
    public void 영속성_객체_추가_테스트(){
        /* 설명: 이 예제에서는 @Id에 해당하는 속성에 직접 값을 넣기 위해
        *   @GeneratedValue(strategy = GenerationType.IDENTITY) (((Menu.java)))) 주석 처리*/
        /* 필기: 이게 Auto Increment 개념 */
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();

        Menu menuToRegist=new Menu();
        menuToRegist.setMenuCode(500);
        menuToRegist.setMenuName("수박죽");
        menuToRegist.setMenuPrice(5000000);
        menuToRegist.setCategoryCode(10);
        menuToRegist.setOrderableStatus("Y");

        entityManager.persist(menuToRegist);
        Menu foundMenu=entityManager.find(Menu.class, 500);

        transaction.commit();
        Assertions.assertTrue(foundMenu==menuToRegist);
    }

    @Test
    public void 영속성_객체_추가_및_변경_테스트(){
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();

        Menu menuToRegist=new Menu();
        menuToRegist.setMenuCode(501);
        menuToRegist.setMenuName("수박죽");
        menuToRegist.setMenuPrice(5000000);
        menuToRegist.setCategoryCode(10);
        menuToRegist.setOrderableStatus("Y");

        entityManager.persist(menuToRegist);
        menuToRegist.setMenuName("메론죽");
        Menu foundMenu=entityManager.find(Menu.class, 501);

        transaction.commit();
        Assertions.assertTrue("메론죽"== foundMenu.getMenuName());
    }

    @Test
    public void 준영속성_detach_테스트(){
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();

        Menu foundMenu1=entityManager.find(Menu.class, 500);
        Menu foundMenu2=entityManager.find(Menu.class, 501);

        System.out.println("foundMenu1 = " + foundMenu1);
        System.out.println("foundMenu2 = " + foundMenu2);

        entityManager.detach(foundMenu2);

        foundMenu1.setMenuPrice(7000);
        foundMenu2.setMenuPrice(7000);

        Assertions.assertNotEquals(7000, entityManager.find(Menu.class, 501).getMenuPrice());

        /* 설명:
        *   영속성 컨텍스트가 관리하던 엔티티 객체를 잠시 관리하지 않는 상태가 되게 한 것을 준영속 상태라고 한다.
        *   detach, clear, close가 준영속 상태를 만들기 위한 메서드다
        *
        *   설명
        *    준영속 상태를 사용하는 이유
        *   JPA에서 엔티티를 더 이상 영속성 컨텍스트에서 관리하지 않음을 의미하며, 특정 상황에서
        *   1) 성능 최적화
        *   2) 데이터 무결성 유지
        *   3) 특정 작업 후 엔티티 변경 방지
        *   를 위해 사용한다*/
        entityManager.merge(foundMenu2);

        transaction.commit();

        assertEquals(7000, entityManager.find(Menu.class, 500).getMenuPrice());
        assertEquals(7000, entityManager.find(Menu.class, 501).getMenuPrice());
    }

    @Test
    public void 준영속성_clear_close_테스트(){
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        Menu foundMenu1=entityManager.find(Menu.class, 500);
        Menu foundMenu2=entityManager.find(Menu.class, 501);

//        entityManager.clear();              // 영속성 컨텍스트에 있는 모든 영속상태의 엔티티를 준영속 상태로 변경
        entityManager.close();              // 기존의 영속 상태의 엔티티들이 모두 준영속 상태로 변경 + 영속성 컨텍스트 파괴
        entityManager=entityManagerFactory.createEntityManager();   // 새로운 매니저를 생성

        foundMenu1.setMenuPrice(90000);
        foundMenu2.setMenuPrice(90000);
        transaction.commit();

        assertEquals(90000, entityManager.find(Menu.class, 500).getMenuPrice());
        assertEquals(90000, entityManager.find(Menu.class, 501).getMenuPrice());
    }

    @Test
    public void 병합_merge_수정_테스트(){
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();

        Menu menuToDetach = entityManager.find(Menu.class, 500);
        entityManager.clear();

        menuToDetach.setMenuName("앙복이김치찜");

        Menu refoundMenu=entityManager.find(Menu.class, 500);
        System.out.println("첫 번째 주소값 = " + menuToDetach.hashCode());
        System.out.println("두 번째 주소값 = " + refoundMenu.hashCode());

        entityManager.merge(menuToDetach);

        Menu managedMenu=entityManager.find(Menu.class, 500);

        transaction.commit();

        assertEquals("앙복이김치찜", managedMenu.getMenuName());


    }
}
