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

        System.out.println();

        /* 설명: Stream으로 관리되는 요소들을 원하는 갯수만큼 반복할 수 있다*/
        /* 필기: 반복? 이 맞나? */
        Stream<String> strStream2=Arrays.stream(sArr,0,2);
        strStream2.forEach(System.out::println);

        /* 설명: Builder를 활용한 스트림 생성
        *   Builder는 static<T>로 되어 있는 메소드이며, 호출 시 타입 파라미터를 메소드 호출 방식으로 전달한다
        * */
        System.out.println("==== Builder로 스트림 생성 ====");
                                                /* 필기: <String>을 붙이는 위치가 특이함 */
        Stream<String> builderStream=Stream.<String>builder()
                                                    .add("홍길동")
                                                    .add("유관순")
                                                    .add("윤봉길")
                                                    .build();
        /* 필기: 결국 빌더로 스트림을 만든다는 얘기. build() 쓰는건 특이하네.
            생각해보니 StringBuilder 객체만 썼지 builder() 는 처음 보네 */

        /* 필기: 굳이 따로 있는건 builder()를 굳이 써야하는 경우가 있다는건데...
        *   미리 만들어놓은 StringBuilder 객체를 쓴다던가  */
        builderStream.forEach(System.out::println);

    }
}
