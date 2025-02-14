package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 필기:
*   최종 연산으로 forEach만 쓸 수 있는게 아니구나!!!!!! */
public class Application2 {
    public static void main(String[] args) {
        /* 목표: 스트림의 최종 연산 중 하나인 reduce에 대해 이해하고 사용할 수 있다*/
        /* 설명: reduce()는 스트림의 요소들을 하나의 값으로 줄이는(reduce) 최종 연산이다*/

        /* 목차: 1. 인자가 1개일 경우 */
        OptionalInt reduceOneParam= IntStream.range(1,4)
                .reduce((a,b) -> a+b);
        int sum = reduceOneParam.getAsInt();
        System.out.println("sum = " + sum);

        /* 목차: 2. 인자가 2개일 경우*/
        int reduceTwoParam=IntStream.range(1,4)
                .reduce(100,Integer::sum);
        System.out.println("reduceTwoParam = " + reduceTwoParam);

        /* 목차: 3. 인자가 3개일 경우 */
        /* 설명:
        *   매개변수 3번째는 좀 더 효율적인 가산 누적연산을 위한 중계 합계 처리용 람다식을 작성한다
        *   2번째 인자의 결과와 호환이 가능해야 한다*/
        Integer reduceThreeParam= Stream.of(4,54352,3452,435,2435,243,5,2,453)
                .reduce(100,Integer::sum,(a,b)->a+b);
        System.out.println("reduceThreeParam = " + reduceThreeParam);
    }
}
