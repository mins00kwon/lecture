package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /* 목표: Stack에 대해 이해하고 사용할 수 있다*/
        /* 설명: Stack 이란?
        *   후입선출(LIFO) 또는 선입후출(FILO)의 자료구조로
        *   push(), pop(), peek() 등의 메소드를 활용할 수 있다*/

        /* 설명: Stack 객체 생성 후 데이터 추가*/
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        System.out.println("integerStack = " + integerStack);
        System.out.println("integerStack.peek() = " + integerStack.peek());

        /* 설명: search에 전달인자로 넣는 객체는 동등비교가 가능해야 함
        *   내가 만든 클래스인 경우 (e, h) 오버라이딩을 해두어야 한다
        * */
        System.out.println("integerStack.search(2) = " + integerStack.search(2));
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack = " + integerStack);
        System.out.println("integerStack.isEmpty() = " + integerStack.isEmpty());
    }
}
