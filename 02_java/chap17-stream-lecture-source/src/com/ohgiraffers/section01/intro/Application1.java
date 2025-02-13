package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {

        int coreCount=Runtime.getRuntime().availableProcessors();
        System.out.println("CoreCount: "+coreCount);

        /* 목표: Stream에 대해 이해하고 활용할 수 있다*/
        /* 설명:
        *   Arrays.asList(): 매개변수로 요소들을 전달하면 List로 반환
        *   ArrayList<>(Collection 타입): Collection 타입을 ArrayList 객체로 생성할 때 쓰이는 생성자*/

        /* 필기: 이건 람다는 스트림이랑은 아마 상관 없는 줄입니당. 헷갈리지 마이쇼 */
        /* 필기: 이미 있는 배열을 리스트로 바꾸려면? 질문 */
        List<String> stringList= Arrays.asList("hello", "world","steam");


        /* 설명: Main 쓰레드 상에서 스트림을 사용하지 않고 확인*/
        System.out.println("==== for each ====");
        for(String str : stringList) {
            /* 필기: 출력하면서 쓰레드 이름을 출력 */
            System.out.println("str: "+str+" // Thread: "+Thread.currentThread().getName());
        }

        /* 설명: Main 쓰레드 상에서 단순 스트림을 사용하고 확인
        *   == cpu 코어 병렬 처리*/
        System.out.println("==== normal stream ====");
        /* 필기: 내가 원하는 형태로 출력하겠다는 뜻
        *   print를 정의한다 */
        stringList.stream().forEach(x->Application1.print(x));
        /* 설명: 컬렉션은 stream()을 생략해도 된다
        *   == stream 으로 바꿔주지 않아도 stream으로 처리 가능*/
        stringList.forEach(System.out::println);

        /* 설명: Main 쓰레드 상에서 병렬 스트림을 사용하고 확인*/
        System.out.println("==== parallel stream ====");
        /* 필기: 위랑 같은 기능을 하는 코드임을 이해하자(print 부분이) */
        /* 필기: 내가 쓰레드를 지정하는건 아니고 알아서 처리해줌 */
        stringList.parallelStream().forEach(Application1::print);
        /* 설명: cpu 코어들을 효율적으로 사용해 성능 향상(속도 향상)*/


    }
    private static void print(String x) {
        System.out.println(x+": "+Thread.currentThread().getName());
        System.out.println(x+": "+Thread.currentThread().getName());
        System.out.println(x+": "+Thread.currentThread().getName());
    }
}
