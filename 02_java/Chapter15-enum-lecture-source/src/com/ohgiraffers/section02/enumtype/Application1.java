package com.ohgiraffers.section02.enumtype;

// enum 기본 사용
public class Application1 {
    public static void main(String[] args) {
        // enum 타입의 생성자는 직접 사용할 수 없다
//        Subjects subject2=new Subjects();
        Subjects subject1=Subjects.JAVA;
        Subjects subject2=Subjects.HTML;
        Subjects subject3=Subjects.JAVA;

        /* 설명:
        *   1. 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며 인스턴스가 각각 한 개임을 보장한다
        *       작성한 순서에 따라 각각은 다른 인스턴스가 생성되며
        *       최초 호출시에 enum의 생성자를 활용해 생성된다(lazy singleton 개념)
        *   2. 단일 인스턴스를 보장하기에 == 비교 (동일 객체 비교)가 가능하다*/

        //서로 다르다고 뜨는 건 다른 객체이기 때문
        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 객체다");
        }else{
            System.out.println("서로 다른 과목이다");
        }

        // 같은 과목이라고 뜨는 이유는 서로 같은 객체이기 때문(싱글톤 객체이므로)
        if (subject1 == subject3) {
            System.out.println("두 과목은 같은 객체다");
        }else{
            System.out.println("서로 다른 과목이다");
        }
        /* 설명: 3. 상수 필드명을 문자열로 변경하기 쉽다*/
        System.out.println(Subjects.JAVA);
        System.out.println(Subjects.JAVA.toString());
        System.out.println(Subjects.JAVA.name());

        /* 설명: 4. vallues()를 이용하면 상수값 배열을 반환받고 이를 활용하여 연속처리가 가능
        *       (상수 필드에 주입된 객체들을 순회할 수 있다)*/
        Subjects[] subjects=Subjects.values();
        for (Subjects subject:subjects) {
            System.out.println(subject);
            System.out.println(subject.ordinal());  // enum에 선언된 상수들의 순서를 인덱스 체계로 추출
        }

        /* 설명: 5. 타입 안정성을 보장한다*/
        printSubjects (Subjects.JAVA);
        /*printSubjects (0);*/ // -> Subjects 타입이 아니면 전달할 수 없다.
    }

    private static void printSubjects(Subjects subjects) {
    }
}
