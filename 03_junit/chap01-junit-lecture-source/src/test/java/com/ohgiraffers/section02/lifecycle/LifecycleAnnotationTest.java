package com.ohgiraffers.section02.lifecycle;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifecycleAnnotationTest {
    /* 목표: 테스트메소드의 실핸 전 후에ㅔ 동작하는 어노테이션을 사용할 수 있다*/
    /* 설명:
    *   모든 테스트 메소드와 라이프사이클 관련 메소드는 abstract이면 안되고, void 반환형으로 작성해야 한다
    *   또한, 접근 제어자는 사용하지 않아도 되지만(=default 가능), private이면 안된다*/

    @BeforeAll  /* 필기: 한번만 실행됨. 전처리 필요한 경우 사용 */
    /* 설명: 테스트 실행되기 전에 한번만 실행(static으로 작성)*/
    public static void beforeAll() {
        System.out.println("Before All");
    }

    /* 설명: 각각의 테스트 메소드가 실행되기 전에 주로 테스트 전에 필요한 목업 데이터를 미리 세팅하는 목적으로 사용
    *   반환형이 존재하지 않으므로 전역변수를 사용함*/
    @BeforeEach
    public void beforeEach() {
        System.out.println("Before Each");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }

    /* 설명:
    *   각각의 테스트 메소드가 동작한 이후 실행된다
    *   주로 단위 테스트들이 수행된 이후 사용한 자원을 반나/해체할 목적으로 사용된다*/
    @AfterEach
    public void afterEach() {
        System.out.println("After Each");
    }
    /* 필기: 리소스 반납 용도로 많이 사용함 */
    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }
}
