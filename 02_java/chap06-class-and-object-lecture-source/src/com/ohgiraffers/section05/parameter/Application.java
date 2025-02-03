package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /* 목표: 메소드의 파라미터(매개변수)에 대해 이해하고 사용할 수 있다*/
        // call by reference 와 call by value 내용까지

        ParameterTest pt = new ParameterTest();

        /* 목차: 1. 기본 자료형을 매개변수로 전달 받는 메소드 호출 */
        /* 설명: 리터럴 값(참소 주소값X) 을 전달해서 메소드를 호출 시에는 서로 다른 지역변수로 서로 영향 x*/
        int num = 20;
        System.out.println("Call by Value 전: " + num);
        pt.testPrimitiveTypeParameter(num);
        System.out.println("Call by Value 후: " + num);

        /* 목차: 2. 기본자료형 배열을 배개변수로 전달 받는 메소드 호출 */
        /* 설명: 참조 주소값을 전달해서 메소드를 호출 시에는 서로 영향을 줌
         *       따라서 반환할 필요가 없다.*/
        int[] iArr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Call by Value 전: " + Arrays.toString(iArr));
        pt.testPrimitiveTypeParameter(iArr);
        System.out.println("Call by Value 후: " + Arrays.toString(iArr));

    }
}
