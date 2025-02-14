package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: */
        /* 설명: range()
        *   range(시작값, 종료값): 시작값부터 1씩 증가하는 숫자로 종료값 직전(종료값 -1)까지 범위의 스트림 생성
        *   rangeClosed(시작값, 종료값): 시작값부터 1씩 증가하는 숫자로 종료값까지 포함한 스트림 생성
        * */
        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(value -> System.out.print(value+" "));
        System.out.println();

        LongStream longStream = LongStream.range(5L, 10L);
        longStream.forEach(value -> System.out.print(value+" "));
        System.out.println();

        /* 설명: Wrapper 클래스 자료형의 스트림이 필요한 경우
        *   Wrapper 클래스 자료형의 스트림이 필요한 경우 Boxing도 가능하다
        *   double(갯수): 난수를 활용한 DoubleStream을 갯수만큼 생성하여 반환한다
        *   boxed(): 기본 타입 스트림인 XXXStream을 박싱하여 Wrapper  타입의 Stream<XXX>로 변환한다*/
        /* 필기: DoubleStream은 .rnage() 메소드가 없음 */
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value -> System.out.print(value+" "));
        System.out.println();

        /* 설명: 추가로 두가지 더!*/
        /* 설명: 문자열을 split 하여 Stream<String>으로 생성*/
        Stream<String> splitStream=
                Pattern.compile(",").splitAsStream("httml,css,javascript");
        splitStream.forEach(System.out::println);

        /* 설명: iterate()을 활용하여 수열 형태의 스트림 생성 */
        Stream<Integer> intStream2=Stream.iterate(10,value->value*2)
                .limit(10);
        intStream2.forEach(value-> System.out.print(value+" "));
    }
}
