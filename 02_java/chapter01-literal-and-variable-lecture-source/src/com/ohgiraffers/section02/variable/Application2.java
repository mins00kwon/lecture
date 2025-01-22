package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: 변수를 선언하고 값을 할당하여 사용할 수 있다(feat.자료형(type)*/

        /* 목차 1: 정수를 취급하는 자료형*/
        byte bNum;  // 1byte
        short sNum;  // 2byte
        int iNum;   // 4byte
        long lNum;  // 8byte


        /* 목차 2: 실수를 취급하는 자료형*/
        float fNum; // 4byte
        double dNum;// 8byte

        /* 목차 3: 문자를 취급하는 자료형*/
        char ch;    // 2byte

        /* 목차 4: 논리값을 취급하는 자료형*/
        boolean isTrue; // 1byte
        // 긍정 의문문 형태로 사용하는 것이 관례
        /* 목차 5: 문자열을 취급하는 자료형*/
        String str;

        /* 설명: 각 변수에 값 대입해보기*/
        bNum = 1;           //자료형 일치 예외 케이스 1
        sNum = 2;           //자료형 일치 예외 케이스 2
        iNum = 4;
        lNum = 8;  //long 자료형이라는 사실을 명시하기 위에 끝에 대문자 L을 붙임
        //java는 정수형을 int 리터럴로 받아들이기 때문에 다른 자료형이라는 사실을 명시해야 함
        fNum = 3.14f;         //java는 실수형을 double 리터럴로 받아들임 (기본 값)
        dNum = 5.6789;        //담으려는 변수의 자료형과 담는 리터럴의 자료형이 반드시 일치해야 함
        //이건 왜 됨?

        ch = 'a';             // char는 숫자를 담을 수 있는데 양수만 가능하다.
        ch = 97;              // 아스키 코드나 유니코드 체계에는 음수가 없음

        isTrue = true;

        /* 설명: 변수를 활용한 합계, 평균 출력해 보기*/
        int kor = 90;
        int math = 80;
        int eng = 75;

        int sum = kor + math + eng;
        System.out.println(sum);

        double av = sum / 3.0;  // 연산 시 소수점을 살리고 싶으면 최소 하나는 실수형으로 계산할 것
        System.out.println(av);
    }
}
