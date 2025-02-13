package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: Stream에 대해 이해하고 활용할 수 있다*/
        /* 설명:
        *   Arrays.asList(): 매개변수로 요소들을 전달하면 List로 반환
        *   ArrayList<>(Collection 타입): Collection 타입을 ArrayList 객체로 생성할 때 쓰이는 생성자*/

        /* 필기: 이건 람다는 스트림이랑은 아마 상관 없는 줄입니당. 헷갈리지 마이쇼 */
        /* 필기: 이미 있는 배열을 리스트로 바꾸려면? 질문 */
        List<String> stringList= Arrays.asList("hello", "world","steam");

        System.out.println("==== for each ====");
        for(String str : stringList) {
            /* 필기: 출력하면서 쓰레드 이름을 출력 */
            System.out.println("str: "+str+" // Thread: "+Thread.currentThread().getName());
        }

    }
}
