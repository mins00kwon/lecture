package com.ohgiraffers.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: Wrapper 클래스에 대해 이해할 수 있다*/
        int intValue = 20;

        /* 설명: 기본자료형을 Wrapper 클래스 자료형으로 변환할 수 있다
        *   이를 박싱(boxing) 이라고 한다*/
        Integer boxInteger = 20;
        Integer boxInteger2 = Integer.valueOf(intValue);

        // 질문 이건 왜 다 true 임?
        System.out.println("(intValue==boxInteger) = " + (intValue == boxInteger));
        System.out.println("(intValue==boxInteger) = " + (intValue == boxInteger2));
        System.out.println("(boxInteger==boxInteger2 = " + (boxInteger==boxInteger2));

        /* 설명: Wrapper 클래스 자료형을 기본자료형으로 변환할 수 있다
        *   이를 언박싱이라고 한다*/
        int autoUnboxedInt= boxInteger;                 // 오토 언박싱
        int autoUnboxedInt2= boxInteger2.intValue();


        anythingMethod(20);
        /* 설명: int 는 primitive 타입이므로 Object를 상속하지 않으나
        *   anythingMethod 로 전달 될 때는 autoBoxing 되어
        *   Object 를 상속받은 Integer 자료형으로 전달되기에 문제 없이 실행됨 */
    }

    private static void anythingMethod(Object object) {
        /* 설명: 출력시에는 Object의 toString)_에서 Integer의 toString()으로 동적바인딩됨      */
        System.out.println("object = " + object+ object.getClass().getName());
    }
}
