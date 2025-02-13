package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 배열이나 컬렉션을 스트림을 이용할 수 있고
        *   이를 이해해서 활용할 수 있다*/
        String[] sArr=new String[]{"java","mariaDB","jdbc"};

        /* 목차: 1. 배열로 Stream 생성 */
        /* 설명: Arrays.stream(배열): 배열 자료형을 Stream 자료형으로 변환*/
        System.out.println("===== 배열로 스트림 생성 =====");
        // 1번
        Stream<String> strStream1= Arrays.stream(sArr);
        /* 필기: 이래서 println 같은것도 람다식 안에 써야 하는구나 */
        /* 필기: 근데 람다식을 정의하지도 않고 그냥 써제끼네? */

        /* 설명: forEach
        *   자신의 매개변수에 정의된 람다식의 매개변수로
        *   stream의 각 요소들을 자동으로 넘기며 순회(람다식 실행)*/
        // 2번
//        strStream1.forEach(x->System.out.println(x));
        strStream1.forEach(System.out::println);

        /* 필기: forEach를 돌리고 싶은데 stream에만 쓸 수 있으니 Arrays.strea(sArr)을 해준다고 생각 */
        Arrays.stream(sArr).forEach(System.out::println);


    }
}
