package com.ohgiraffers.section05.typecasting;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: 강제 형변환 규칙에 대해 이해할 수 있다*/
        /* 설명
        강제형변환
            바꾸려는 자료형으로 캐스팅 연산자 () 를 이용하여 형변환한다
        */

        long lNum = 8000000000L; // 90억임
        int iNum = (int) lNum;  // 16byte 중에서 앞 8byte 를 그냥 뭉텅 잘라버리는거
        System.out.println("iNum = " + iNum);

        /* 설명: 실수형 자료형에서 정수형 자료형으로 강제 형변환하면 의도적으로 소수점 이하를 제거할 수 있다*/
        float avg = 31.234f;
        int floorNum = (int) avg;
        System.out.println("floorNum = " + floorNum);
    }
}
