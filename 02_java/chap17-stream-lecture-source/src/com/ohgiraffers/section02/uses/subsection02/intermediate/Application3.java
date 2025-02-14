package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application3 {
    public static void main(String[] args) {
        /* 목표: 스트림의 중계 연산 중 하나인 sorted에 대해 이해하고 사용할 수 있다*/
        /* 필기: 이게 무슨 코드임....?? */
        List<Integer> integerList =IntStream.of(5,10,99,1,2,35)
                .boxed()
                .sorted(new DescInteger())      /* 필기: 사용자 정의 정렬 기준 적용 */
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}
