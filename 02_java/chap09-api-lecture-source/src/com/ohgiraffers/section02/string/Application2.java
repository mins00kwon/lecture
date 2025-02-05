package com.ohgiraffers.section02.string;

public class Application2 {
    static String str2="java";
    public static void main(String[] args) {
    /* 목표: 문자열 객체를 생성하는 다양한 방법읈 숙지하고 인스턴스가 생성되는 방식을 이해할 수 있다*/
    /* 설명: 문자열 객체를 만드는 방법
    *   1. "" 리터럴 형태: 동일한 값을 가지는 인스턴스(동등(e,h))를 단일 인스턴스로 관리한다
    *       (constant pool(=상수풀) 에서 활용. 일종의 singleton 개념
    *       equals와 hashCode 가 오버라이딩 되어 있음
    *   2. new String("") 형태: 매번 새로운 인스턴스를 생성한다. 주소값이 매번 다름
    *   */
    String str1="java";
//    String str2="java";

    String str3=new String("java");
    String str4=new String("java");

    System.out.println("str1==str2 = " + (str1==str2));
    System.out.println("str2==str3 = " + (str1==str3));
    System.out.println("str3==str4 = " + (str3==str4));

    /* 설명: 문자열은 불변객체(immutable object) 로 변화를 주면 학상 새로운 객체(인스턴스)가 생성된다*/
        // 계속해서 변화하는 문자열에는 String을 쓰기 부담스러움. 쓰지 않는 객체가 늘어나니까
    String str="java";
    int strHash=str.hashCode();
    str+="banana";
    int changedStrHash=str.hashCode();
    System.out.println("strHash = " + strHash);
    System.out.println("changedStrHash = " + changedStrHash);
    System.out.println("(changedStrHash==strHash = " + (changedStrHash==strHash));
    }
}
