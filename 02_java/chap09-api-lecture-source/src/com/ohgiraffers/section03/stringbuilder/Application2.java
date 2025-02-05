package com.ohgiraffers.section03.stringbuilder;

import org.w3c.dom.ls.LSOutput;

public class Application2 {
    public static void main(String[] args) {

    /* 목표: StringBuilder의 자주 사용되는 메소드의 용법 및 원리는 이해할 수 있다*/
    StringBuilder sb=new StringBuilder("javamariaDB");
    /* 설명: 메소드 차이는 없지만 stringBuilder와 비교하여 다소 느림
    *   동시성 제어 알고리즘이 돌아가기 때문*/
    StringBuffer sb2=new StringBuffer("java");

    /* 설명: delete()
    *   시작 인덱스와 종료 인덱스를 사용해서 문자열에서 원하는 문자열 부분 제거
    *   deleteCharAt()
    *   문자열 인덱스를 이용해서 문자 하나를 제거
    * */
        System.out.println("sb = " + sb);
        System.out.println("delete(2,5): "+ sb.delete(2,5));
        System.out.println("sb = " + sb);
        System.out.println("sb.deleteCharAt(2) = " + sb.deleteCharAt(2));
        System.out.println("sb = " + sb);

        /* 설명: insert()
         *   인자로 전달된 값을 문자열로 반환 후 지정된 인덱스 위치에 추가한다*/
        System.out.println("sb.insert(1,vao) = " + sb.insert(1, "vao"));
        System.out.println("sb.insert(0,\"j\") = " + sb.insert(0,"j"));
        System.out.println("sb.insert(sb.length(),\"jdbc\") = " + sb.insert(sb.length(),"jdbc"));

        /* 설명: reverse()
        *   문자열 인덱스 순번을 역순으로 재배열한다*/

    }
}
