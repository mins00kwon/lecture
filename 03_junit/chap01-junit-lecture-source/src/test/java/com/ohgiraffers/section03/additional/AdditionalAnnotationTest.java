package com.ohgiraffers.section03.additional;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionalAnnotationTest {
    /* 목표: Junit에서 제공하는 메소드 관련 추가 어노테이션을 사용할 수 있다*/

    @Disabled
    @Test
    public void testIgnore() {}

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)    /* 필기: 시간에 대한 제약 조건 추가 가능 */
    public void testTimeout() throws InterruptedException {
        Thread.sleep(900);      // Thread.sleep을 활용하면 n 미리초만큼 지연 가능
    }

    /* 필기: 테스트 케이스를 내가 원하는 순서대로 실행하고 싶은 경우 */
    /* 필기: @Order 어노테이션만 단다고 끝이 아님
    *   클래스 맨 바깥에 어노테이션 붙여줘야함
    *   @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    *   이건데 진짜 기네..*/
    @Test
    @Order(1)
    public void testFirst(){    }
    @Test
    @Order(2)
    public void testSecond(){    }
    @Test
    @Order(3)
    public void testThird(){}
}
