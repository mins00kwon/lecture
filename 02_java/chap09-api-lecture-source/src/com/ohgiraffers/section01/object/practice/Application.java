package com.ohgiraffers.section01.object.practice;

/* 설명: Object는 최상위 부모 클래스이므로 어떤 클래스던지 Object 변수에 담을 수 있음
*   또한 Object에 있는 함수는 어떤 클래스에서도 오버라이딩 가능함
*   Object의 대표 메소드로는
*   toString
*   equals
*   hashCode가 있음*/
public class Application {
    public static void main(String[] args) {
        PracticeClass practiceClass = new PracticeClass(1,"권민수");
        System.out.println("practiceClass = " + practiceClass);
        System.out.println("practiceClass.toString() = " + practiceClass.toString());
    }
}
