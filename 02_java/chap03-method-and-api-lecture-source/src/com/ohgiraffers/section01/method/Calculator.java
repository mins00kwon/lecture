package com.ohgiraffers.section01.method;

import org.w3c.dom.ls.LSOutput;

public class Calculator {//이런 애는 main 안만듦
    public int plusTwoNumbers(int first, int second) {return first + second;}

    public int minNumbersOf(int first, int second) { return (first < second) ? first : second;}

    public static int maxNumbersOf(int first, int second) {return (first > second) ? first : second;}

}
