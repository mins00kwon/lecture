package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        /* 목표: 스트림의 최종 연산 중 하나인 match에 대해 이해하고 사용할 수 있다*/
        /* 필기: 무조건 boolean 값 하나만 뱉는 애인가? */
        /* 필기: stream 안에 있는 요소들이 조건을 만족하는지 확인하는 람다식 */

        List<String> stringList= Arrays.asList("one", "two", "three", "four", "five");
        boolean anyMatch=stringList.stream().anyMatch(str->str.contains("o"));
        boolean allMatch=stringList.stream().allMatch(str->str.length()>4);
        boolean noneMatch=stringList.stream().noneMatch(str->str.contains("c"));
        System.out.println("anyMatch = " + anyMatch);
        System.out.println("allMatch = " + allMatch);
        System.out.println("noneMatch = " + noneMatch);
    }
}
