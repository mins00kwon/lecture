package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: 스트림의 중계 연산 중 하나인 map에 대해 이해하고 사용할 수 있다*/
        /* 필기: 나 이거 배우고 싶었음 */
        /* 설명: 맵(map)은 스트림에 들어있는 데이터를 람다식으로 가공하고 새로운 스트림에 담아주는 메소드이다*/
        /* 필기: 사용자 정의 람다식도 가능...? */

        IntStream intStream = IntStream.range(1, 10);
        intStream.filter(i->i%2!=0)                                 // predicate
            .map(i->i*5)                                            // operator (Function 변형체. 매개변수와 반환형의 자료형이 같음)
                .forEach(result->System.out.print(result+" "));     // consumer
    }
}
