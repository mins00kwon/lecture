package com.ohgiraffers.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: Wrapper 클래스에 대해 이해할 수 있다*/
        int intValue = 20;

        /* 설명: 기본자료형을 Wrapper 클래스 자료형으로 변환할 수 있다
        *   이를 박싱(boxing) 이라고 한다*/
        Integer boxInteger = 20;                            // 오토 박싱
        Integer boxInteger2 = Integer.valueOf(intValue);    // 박싱

        // 질문 이건 왜 다 true 임?
        System.out.println("(intValue==boxInteger) = " + (intValue == boxInteger));
        System.out.println("(intValue==boxInteger) = " + (intValue == boxInteger2));
        System.out.println("(boxInteger==boxInteger2 = " + (boxInteger==boxInteger2));

        /* 설명: Wrapper 클래스 자료형을 기본자료형으로 변환할 수 있다
        *   이를 언박싱이라고 한다*/
        int autoUnboxedInt= boxInteger;                 // 오토 언박싱
        int autoUnboxedInt2= boxInteger2.intValue();    // 언박싱



        /* 설명: int 는 primitive 타입이므로 Object를 상속하지 않으나
        *   anythingMethod 로 전달 될 때는 autoBoxing 되어
        *   Object 를 상속받은 Integer 자료형으로 전달되기에 문제 없이 실행됨 */

        /* 설명: Wrapper 클래스 주소값 기교*/
        Integer intgerTest1=30;
        Integer intgerTest2=30;
        System.out.println("== 비교: "+(intgerTest1==intgerTest2));
        System.out.println("equals() 비교: "+(intgerTest1.equals(intgerTest2)));
        System.out.println("System.identityHashCode(intgerTest1) = " + System.identityHashCode(intgerTest1));

        /* 설명: 모든 Wrapper 클래스들도 constant pool 을 활용해 동등 객체는 하나만*동일 인스턴스로) 저장한다*/
        System.out.println("System.identityHashCode(intgerTest2) = " + System.identityHashCode(intgerTest2));

        anythingMethod(20);
    }

    private static void anythingMethod(Object object) {
        /* 설명: 출력시에는 Object의 toString)_에서 Integer의 toString()으로 동적바인딩됨      */
        System.out.println("object = " + object+ object.getClass().getName());
    }
}
