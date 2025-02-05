package com.ohgiraffers.section02.string;

public class Application4 {
    public static void main(String[] args) {
        /* 목표: 이스케이프(escape) 문자 활용 및 printf 를 활용할 수 있다*/
        /* 설명: 이스케이프(escape) 문자
        *   문자열 내에서 사용하는 특수 기능을 위한 문자
        *
        *   \n : 개행
        *   \t : 탭
        *   \' : 작은 따옴표
        *   \" : 큰 따옴표
        *   \\ : 역슬래쉬
        *
        * */
        System.out.println("안녕하세요.\n 저는 홍길동입니다.");
        System.out.println("안녕하세요.\t 저는 홍길동입니다");
        System.out.println("안녕하세요. 저는 \"홍길동\"입니다.");
        System.out.println("안녕하세요. 저는 \\ 입니다");

        /* 설명: printf*/
        // 문자열에서 + 쓰면 안써도 되는게 맞음
        // 2f 라고 쓰면 셋째자리에서 반올림됨
        System.out.printf("원주율은 %.2f입니다. 우린 %d로 하죠\n", 3.147592, 3);
        System.out.println("printf는 자동 개행이 안됩니다");
    }
}
