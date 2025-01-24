package com.ohgiraffers.section01.user_type;

//import static jdk.internal.vm.vector.VectorSupport.test;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        /* 설명:
        *   객체지향프로그래밍(OOP)이란?
        *   OOP(Object Oriented Programming Language
        *   추상화, 캡슐화, 상속, 다형성을 적용하여
        *   유지보수성을 고려한
        *   응집력 높고 결합도 낮은
        *   객체 위주의 개발 방식을 적용한 프로그래밍*/

        /* 설명:
        *   객체지향의 4대 특징
        *   - 추상화(Abstraction) (추상화를 제외하면 3대 특징)
        *   - 캡슐화(Encapsulation)
        *   - 상속(Inheritance)
        *   - 다형성(Polymorphism)
        * */





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
        *   3. 메소드의 반환형으로는 하나의 타입만 가능하지만 현재의 변수들로는 불가능하다.
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

        /* 설명: 함수에 파라미터를 묶음으로 전달할 수 있다*/
        Member.printMember(member2);
        test(member2);
        member2.printMember(member2);

    }

    private static Member test(Member member) {
        System.out.println("개명하고 싶어~!");
        member.name="김용희";
        return member;
    }
}
