package com.ohgiraffers.section02.section02.functionInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: 표준 함수적 인터페이스 중 Supplier 에 대해 이해하고 사용할 수 있다*/
        /* 설명: 매개변수 없고 반환값만 있는 메소드 관련 람다식*/
        /* 필기: 중괄호와 리턴
        *   구문이 하나이기 때문에 중괄호를 생략할 수 있는 상황
        *   중괄호를 생략하려면 return 도 꼭 같이 생략해야 한다 */
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        studyBooleanSupplier();

    }

    private static void studyBooleanSupplier() {
        /* 필기: 실행구문이 두개이기 때문에 중괄호를 없앨 수 없음 */
        BooleanSupplier booleanSupplier = () -> {
            int random=(int)(Math.random()*2);
            return random == 0;
        };

        /* 필기: 위의 코드와 동일한 기능인듯
        *   질문: 맞는지 확인하기 */
        Supplier<Boolean> booleanSupplier2 = () -> {
            int random=(int)(Math.random()*2);
            return random == 0;
        };
    }
}
