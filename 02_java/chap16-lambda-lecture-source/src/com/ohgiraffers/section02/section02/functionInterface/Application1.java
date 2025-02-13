package com.ohgiraffers.section02.section02.functionInterface;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 표준 함수적 인터페이스 중 Consumer에 대해 이해하고 사용할 수 있다*/
//        studySimpleConsumer();
//        studyByConsumer();
//        studyObjectIntConsumer();
    }

    private static void studyObjectIntConsumer() {
        /* 설명:
        *   (int)(Math.random()*갯수)+초기값
        *   new Random().nextInt(갯수)+초기값 (다운캐스팅을 할 필요가 없다)*/
        /* 필기: 왜 제네릭을 하나만 거나 했는데 이름에서 보이듯이 int 는 고정으로 받는 것 */
        ObjIntConsumer<Random> objIntConsumer=
                (random, bound)-> System.out.println("1부터 "+bound+"까지의 난수 발생: "+
                        (random.nextInt(bound)+1));
        objIntConsumer.accept(new Random(),10);
    }

    private static void studySimpleConsumer() {
        /* 설명: 반환형이 없는 메소드 관련 란다식*/
        /* 필기: Consumer라는 인터페이스에 있는 이름 모를 함수를 람다식으로 오버라이딩함 */
        Consumer<String> consumer = str -> System.out.println(str+"(이)가 입력됨");
        /* 필기: Consumer라는 인터페이스에 있는 함수의 이름은 accept 임 */
        consumer.accept("피카츄");
        consumer.accept("hello");
    }

    private static void studyByConsumer() {
        BiConsumer<String, LocalTime> biConsumer=
                (str, time)-> System.out.println(str+"(이)가 "+time+"에 입력됨");
        biConsumer.accept("Hello", LocalTime.now());
    }
}
