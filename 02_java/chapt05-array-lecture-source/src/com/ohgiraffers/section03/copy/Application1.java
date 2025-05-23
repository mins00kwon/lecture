package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다*/
        /* 설명:
        *   배열의 복사에는 크게 두 가지 개념이 있다
        *   1. 얕은 복사(shallow copy): staack의 주소 값만 복사
        *   2. 깊은 복사(deep copy): heap의 배열에 저장된 값을 복사*/

        int[] originArr={1,2,3};
        int[] copyArr=originArr;
        System.out.println("originArr = " + originArr);
        System.out.println("copyArr = " + copyArr);
        copyArr[1]=100;
        System.out.println("Arrays.toString(originArr) = " + Arrays.toString(originArr));

        /* 설명: 메소드를 호출해서 넘기는 전달인자가 참조 자료형(주소값)일 경우
        *   얕은 복사가 일어난다.(feat. call by reference)*/     //주소값이 아니면 지역 변수만 영향을 주는게 맞음
        test(originArr);
        System.out.println("originArr = " + Arrays.toString(originArr));

    }

    private static void test(int[] arr) {
        arr[2]=1001;
    }
}
