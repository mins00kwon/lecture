package com.ohgiraffers.section03.map.run;

import com.ohgiraffers.section01.list.dto.BookDTO;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        /* 목표: Map의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다*/
        Map<Object,Object> map = new HashMap<>();
        map.put("one", new java.util.Date());
        map.put(12, "red apple");
        map.put(33, 123);

        /* 설명: key 값은 동일 비교가 아닌 동등 비교로 비교된다*/
        System.out.println("키가 \"one\"인 value 값: " + map.get("one"));
        System.out.println("map = " + map);

        /* 목차: 1. key가 중복되는 경우
        *   나중에 입력된 값만 남는다 */
        /* 설명: 우리가 만든 객체도 key로 사용할 수 있으며
        *   이 때 해당 객체는 e, h 오버라이딩이 반드시 되어있어야 한다*/
//        map.put(new BookDTO(1,"홍길동전","허균",5000),1);
//        map.put(new BookDTO(1,"홍길동전","허균",5000),2);
        System.out.println("map = " + map);

        /* 목차: 2. value가 중복되는 경우 */
        map.put(44,123);
        System.out.println("map = " + map);

        /* 설명: Map을 활용해보자*/
        Map<String,String> hMap2 = new HashMap<>();
        hMap2.put("one", "java17");
        hMap2.put("two", "mariaDB 10");
        hMap2.put("three", "servlet/jsp");
        hMap2.put("four", "springboot 3.0");
        hMap2.put("five", "vue");

        System.out.println("hMap2 = " + hMap2);

        /* 설명: Map에 담긴 값을 순회하여 확인하는 방법*/
        /* 목차: 1. keySet()을 활용해 key를 Set으로 바꾸고 iterator를 돌리는 방법*/
        Set<String> keys=hMap2.keySet();
        Iterator<String> iterator=keys.iterator();
        while(iterator.hasNext()){
            System.out.println(hMap2.get(iterator.next()));
        }
        /* 목차: 2. entrySet()을 활용하는 방법
        *   key와 value를 묶은 Entry 타입을 통해 key 없이도 value만 추출 가능*/
        // Map.Entry를 쓰는 이유
            // Entry 는 Map 내부에만 정의되어 있음
        Set<Map.Entry<String,String>> entrySet=hMap2.entrySet();
        Iterator<Map.Entry<String,String>> iterator2=entrySet.iterator();
        while(iterator2.hasNext()){
            Map.Entry<String,String> entry=iterator2.next();
            System.out.println("key = "+ entry.getKey()+", value = "+entry.getValue());
        }
    }
}
