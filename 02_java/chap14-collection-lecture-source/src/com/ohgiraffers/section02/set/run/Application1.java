package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: Set 자료구조의 특성을 이해하고 hashSet 을 이용할 수 있다*/
        Set<String> hSet = new HashSet<>();
        hSet.add(new String("Java"));
        hSet.add(new String("Java"));
        hSet.add(new String("mariaDB"));
        hSet.add(new String("servlet"));
        hSet.add(new String("spring"));
        hSet.add(new String("html"));
        /* 설명: 출력 결과 알 수 있는 것
        *   1. 입력한 순서를 보장하지 않음
        *       1) 근데 고정된 순서로 출력하기는 함 -> 내부적으로는 순서가 정해져있음 (hash 알고리즘)
        *   2. 중복된 값이 아닌지를 체크한다
        *       1) 중복의 기준은 동일객체가 아닌 동등객체임
        *       2) 우리가 만든 클래스를 Set 으로 중복처리 하려면 (e, h)를 오버라이딩 해야함
        * */
        System.out.println("hSet = " + hSet);

        /* 설명: Set은 인덱스 개념이 없으므로 Iterator(반복자) 를 활용해야 한다*/
        Iterator<String> iterator = hSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /* 설명: Set 을 배열로 바꾸는 메소드가 있기는 함 (권장 X)
        *   Object 배열로 바뀌기 떄문에 다운캐스팅 해줘야 함*/
        Object[] arr=hSet.toArray();
        for (int i = 0; i < arr.length; i++) {
            // 설명: 이 경우는 print 함수에 의해 자동으로 .toString() 된 결과가 출력되는 것.
            System.out.println((arr[i]));
        }

        /* 설명: size() 함수*/
        System.out.println("hSet.size() = " + hSet.size());

        /* 설명: clear() 함수*/
        System.out.println("/* 설명: clear() 함수*/");
        hSet.clear();
        System.out.println("hSet.size() = " + hSet.size());
    }
}
