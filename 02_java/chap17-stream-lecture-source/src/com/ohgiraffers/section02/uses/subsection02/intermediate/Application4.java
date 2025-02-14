package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        /* 목표: 스트림의 중계 연산 중 하나인 flatMap에 대해 이해하고 사용할 수 있다*/
        List<List<String>> list= Arrays.asList(
                Arrays.asList("JAVA","SPRING","SPTRINGBOOT"),
                Arrays.asList("java","spring","springboot")
        );
        list.forEach(System.out::println);
        System.out.println("list = " + list);

        /* 필기: 깊은 계층의 데이터들을 하나의 리스트로 눌러서 뱉어줌
            포켓몬 api 예제 생각해보면 됨
        *   근데 이러면 문제가 생길수도 있지 않나. 층을 살리고 싶고 깊은 복사만 하고 싶으면 어떡함? */
        List<String> flatList=list.stream().flatMap(Collection::stream)
                .toList();
        flatList.forEach(System.out::println);
        System.out.println("flatList = " + flatList);
    }
}
