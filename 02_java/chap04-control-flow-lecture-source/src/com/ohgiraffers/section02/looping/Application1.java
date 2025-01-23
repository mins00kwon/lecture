package com.ohgiraffers.section02.looping;

public class Application1 {
    public static void main(String[] args) {
        A_for aClass = new A_for();
//        aClass.testSimpleForStatement();
        B_nestedFor bClass = new B_nestedFor();

//        bClass.printGugudanFromTwoToNine();


        /* 설명: 별 찍기
         *   아래와 같은 별모양이 나오도록 작성해 보자
         *   정수를 입력하시오 5
         *       *
         *      **
         *     ***
         *    ****
         *   *****
         * */
//        bClass.printStars();
        C_while cClass = new C_while();
//        cClass.testSimplewhileStatement();
//        cClass.testWhileExample();//

        D_doWhile dClass = new D_doWhile();
        dClass.sumPrice();
    }


}
