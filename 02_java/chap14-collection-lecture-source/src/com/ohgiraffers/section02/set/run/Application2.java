package com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: LinkedHashSet 에 대해 이해하고 활용할 수 있다*/
        /* 설명:
        *   LinkedHashSet은 저장 당시 순서를 유지하는 특성을 자지고 있다
        *   중복 제거 + 순서 유지
        * */

        Set<String> lSet=new LinkedHashSet<String>();
        lSet.add("ramen");
        lSet.add("pork");
        lSet.add("kimchi");
        lSet.add("soup");
        lSet.add("friedEgg");

        Iterator<String> iterator = lSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
