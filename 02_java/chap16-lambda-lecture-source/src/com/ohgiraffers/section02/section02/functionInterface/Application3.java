package com.ohgiraffers.section02.section02.functionInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {
    public static void main(String[] args) {
        /* 목표: 표준 학수적 인터페이스 중 Function에 대해 이해하고 사용할 수 있다*/

        /* 필기: <매개변수, 반환형> 형태 */
        /* 필기: valueOf는 Integer를 반환하고 parseInt 는  int 를 반환함
        *   여기서는 반환형이 Integer라서 valueOf를 사용함*/
        Function<String, Integer> function = str->Integer.valueOf(str);
        String strValue="12345";
        System.out.println(function.apply(strValue) instanceof Integer);
        /* 필기: instanceof integer는 왜 쓰는거지
        *   instanceof 가 뒤에 오는 그 클래스의 인스턴스가 맞냐는 말*/

        /* 필기: <매개변수, 매개변수, 반환형> 형태 */
        BiFunction<String,String,Integer>biFunction=(str1,str2)->
                Integer.parseInt(str1)+Integer.parseInt(str2);
        System.out.println(biFunction.apply("12345", "11111"));
    }
}
