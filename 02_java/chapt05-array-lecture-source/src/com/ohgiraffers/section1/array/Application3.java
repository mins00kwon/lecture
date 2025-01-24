package com.ohgiraffers.section1.array;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        /* 목표: 배열에 초기화되는 자료형별 기본값을 이해할 수 있다*/
        /* 설명:
         *   값의 형태별 기본값
         *   정수: 0
         *   실수: 0.0
         *   논리: false
         *   문자: \u0000
         *   참조: null
         * */

        /* 설명: 선언과 동시에 크기 할당 및 초기화를 한번에 진행하고 싶을 때*/
        int[] iArr={10,20,30,40,50}; // new int[] 는 생략 가능하다
        int[] iArr2=new int[]{10,20,30,40,50};

//        test({10,20,30,40,50});       //이럴 때는 new int[] 생략 불가
        test(new int[]{10,20,30,40,50});


        System.out.println("Arrays.toString(iArr) = " + Arrays.toString(iArr));


        /* 설명: 향상된 for 문(foreach 문)*/
        /* 설명: 받아낼 변수를 활용해 처음부터 끝까지 순회하고 자할 때 쓸 수 있다*/

        for (int i : iArr) {
            i=3;
        }
        for (int i : iArr) {
            System.out.println(i);
        }

    }
    public static void test(int[] iArr){
        for(int i=0;i<5;i++){
            iArr[i]*=10;
        }
    }
}
