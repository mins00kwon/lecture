package com.ohgiraffers.section02.section03.reference;

import java.util.function.BiFunction;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 기존에 존재하는 메소드를 참조해 람다식을 적용할 수 있다*/
        /* 필기: method reference 얘기 나오려나?
        *   기존에 있는거 써서 람다식을 정의내릴 수 있음
        *   질문: 근데 이렇게 똑같이 쓸 거면 굳이 왜 따로 정의를 내림?*/
        /* 필기: 참조하는데는 크게 세 가지 방법이 있는데 이거는 노션 3-1 참고하자 */
        BiFunction<String,String,Boolean> biFunction;
        String str1="METHOD";
        String str2="METHOD";
        boolean result=false;

        /*biFunction=(x,y)->x.equals(y);*/
        /* 필기: method reference 사용
        *   내가 만들어도 똑같이 작동할 것 같을 때 사용 */
        biFunction= String::equals;

        result=biFunction.apply(str1,str2);
        System.out.println("result = " + result);
    }
}
