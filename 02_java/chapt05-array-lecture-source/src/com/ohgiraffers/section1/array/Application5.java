package com.ohgiraffers.section1.array;

public class Application5 {
    public static void main(String[] args) {
        /* 목표: 배열을 사용해 간단한 카드 뽑기 게임을 작성해보자*/
        String[] shape={"SPADE","CLOVER","HEART","DIAMOND"};
        String[] numbers={"10","2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING"};
        int randomShapeIndex=(int)(Math.random()*shape.length);
        int randomNumberIndex=(int)(Math.random()*numbers.length);

        System.out.println("당신이 뽑은 카드는 "+shape[randomShapeIndex]+" "+numbers[randomNumberIndex]+"입니다.");

    }
}
