package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        /* 목표: 반환값이 있는 메소드를 작성할 수 있다*/
        String result=testMethod();
        System.out.println("result = " + result);
        // 굳이 한번 사용되는 변수를 만들어야함?
        // ㄴㄴㅋㅋ
        System.out.println("testMethod() = " + testMethod());       // 호에 이거 관련해서 설명할게 있다궁?
    }

    private static String testMethod() {
        System.out.println("testMethod 메소드 실행됨....");
        // return null;        // 호옹 그냥 null 리턴해도 문제는 없넹
                            // 이러면 나중에 예외 처리 하기도 쉽겠는뎅?
        return "testMethod";
    }
}
