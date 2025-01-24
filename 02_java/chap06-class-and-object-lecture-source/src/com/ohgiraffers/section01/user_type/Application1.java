package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        String id="user01";
        String pwd="pass01";
        String name="홍길동";
        int age=20;
        char gender='남';
        String[] hobbies=new String[]{"축구","농구", "야구"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("hobbies = " + Arrays.toString(hobbies));

        /* 설명: 이렇게 변수들로만 관리할 때 발생할 수 있는 문제점
        *   1. 많은 변수들을 관리하기 어렵다. (한 묶음으로 생각하거나 코딩할 수 없다)
        *   2. 메소드에 전달인자로 전달할 값이 많으므로 매개변수의 갯수가 늘어난다
        *       (냄새나는 코드)
        * */
        Member member1 = new Member();
        Member member2 = new Member();
        member1.name="김철수";
        member2.name="김영희";

        /* 설명: 김형희씨 완성*/
        member2.age=18;
        member2.gender='여';
        member2.hobbies=hobbies;
        member2.id="user02";
        member2.pwd="pass02";

        System.out.println("김영희씨의 이름과 나이를 말해주세요: "+
                                member2.name+", "+member2.age);


    }
}
