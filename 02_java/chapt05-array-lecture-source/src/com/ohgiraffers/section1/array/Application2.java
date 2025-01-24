package com.ohgiraffers.section1.array;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: 배열의 사용방법을 익혀 배열을 사용할 수 있다*/
        /* 설명:
        *   배열의 사용방법
        *   1. 배열의 선언
        *   2. 배열의 크기 할당
        *   3. 배열의 인덱스 공간에 값 대입*/

        /* 설명:  [] 이 위치는 변수명 뒤에 써도 성립하지만 지양하자
        *   이유: 변수의 이름이 길면 배열이라는 사실을 놓칠 수 있다*/
        int[] iArr;
        char cArr[];
        /* 설명: stack 영역에 4byte만 올라가있는 상태
        *   왜냐하면 크기를 지정을 안했으니까*/

        iArr=new int[5];
        cArr=new char[5];

        System.out.println("iArr = " + iArr);
        System.out.println("Arrays.toString(cArr) = " + Arrays.toString(cArr));

        cArr=null;
        System.out.println("cARR의 주소를 10진수 형태로 보고 싶다:"+ cArr.hashCode());


    }
}
