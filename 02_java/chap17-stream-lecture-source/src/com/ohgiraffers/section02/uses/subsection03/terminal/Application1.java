package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 스트림의 최종 연산(Terminal Operator) 중 하나인 calculation 에 대해 이해하고 사용할 수 있다*/
        long count= IntStream.range(1,10).count();
        int sum= IntStream.range(1,10).sum();

        /* 필기 바깥에 있는 변수는 못 씀
        int a=0;
        IntStream intStream=IntStream.range(1,10).forEach(i->a+=i);*/
        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

        /* 필기: 없을 수도 있기 때문에 OptionalInt임
        *   1. OptionalInt 를 어떻게 int로 바꿈?
        *   2.  */
        OptionalInt max = IntStream.range(1,10).max();      /* 필기: 기본 자료형에 null 을 넣을 수 없으므로 empty가 들어감 */
        System.out.println("max = " + max);
        OptionalInt min = IntStream.range(1,10).min();
        System.out.println("min = " + min);
        int a = max.getAsInt();

        int oddSum=IntStream.range(1,10).filter(i -> i%2!=0).sum();
        System.out.println("oddSum = " + oddSum);
    }
}
