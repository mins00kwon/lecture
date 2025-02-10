package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.dto.BookDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Application3 {
    public static void main(String[] args) {
        /* 목표: List계열을 출력하는 4가지 방법*/
        List<String> list = new ArrayList<>();

        /* 설명: 다형성이 적용되기 때문에 Vector로 바꿔도 어떤 오류도 발생하지 않는다
        *   Vector는 동기화 처리를 위한 알고리즘이 추가되어 비교적 느리다*/
//        List<String> list = new Vector<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("mango");
        list.add("grape");

        /* 설명: 1. toString() 활용하기*/
        System.out.println("/* 설명: 1. toString() 활용하기*/");
        System.out.println("list = " + list);
        System.out.println("list.toString() = " + list.toString());

        /* 설명: 2. for문 활용하기*/
        System.out.println("/* 설명: 2. for문 활용하기*/");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /* 설명: 3. for-each문 활용하기*/
        System.out.println("/* 설명: 3. for-each문 활용하기*/");
        for(String fruit : list) {
            System.out.println(fruit);
        }

        /* 설명: 4. iterator 활용하기*/
        // list.iterator() 는 list 객체를 바탕으로 Iterator 객체를 만들어냄
        // 질문: 설명이 이게 맞아?
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // --------------------------------------------------
        /* 설명: 1번 인덱스 과일 수정*/
        System.out.println("/* 설명: 1번 인덱스 과일 수정*/");
        list.set(1,"pineapple");
        System.out.println("list = " + list);
        
        /* 설명: list가 관리하는 요소 제거*/
        System.out.println("/* 설명: list가 관리하는 요소 제거*/");
        /* 설명: 3번째 요소 제거*/
        System.out.println("/* 설명: 3번째 요소 제거*/");
        list.remove(2);
        System.out.println("list = " + list);
        
        /* 설명: clear()
        *   모든 요소를 제거하는 메소드*/
        System.out.println("clear()");
        list.clear();
        System.out.println("list = " + list);
        
        /* 설명: isEmpty() 
        *   리스트가 비어있는지 확인하는 함수*/
        System.out.println("list.isEmpty() = " + list.isEmpty());

        /* 설명: list=null 인 경우
        *   애초에 접근할 객체조차 없기 떄문에 에러가 발생할 수 밖에 없음
        *   list==null 로 처리해야 함*/
        System.out.println("list가 null 인 경우 isEmpty() 의 작동");
        list=null;
        try{
            System.out.println("list.isEmpty() = " + list.isEmpty());
        }catch (Exception e){
            System.out.println("역시 에러가 나는군요");
            System.out.println("list.isEmpty() = " + e.getMessage());
        }
    }
}
