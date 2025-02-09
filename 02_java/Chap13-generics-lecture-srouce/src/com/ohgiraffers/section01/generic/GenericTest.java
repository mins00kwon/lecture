package com.ohgiraffers.section01.generic;

import sun.net.www.content.text.Generic;

/* 설명: 제네릭 클래스의 다이아몬드 연산자(<>)에 들어갈 수 있는 4가지 타입
*   E: Element
*   T: Type
*   K: Key
*   V: Value
*
*   의미부여만 하는 것. 기능이 다르지는 않다.
*
*   약속된 키워드. 이 외에 다른 키워드를 쓴다고 해도 오류가 발생하지는 않는다*/

public class GenericTest<T> {
    private T value;

    public GenericTest(){

    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
