package com.ohgiraffers.section01.list.run;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /* 목표: Queue 에 대해 이해하고 활용할 수 있다*/
        /* 설명: Queue 란?
        *   선형 메모리 공간에 데이터를 저장하여 순서를 유지하기 위한 선입선출(FIFO) 방식의 자료구조
        *   대부분 LinkedList 를 사용해서 구현한다
        * */

        // /* 설명: Queue 는 생성자를 활용할 수 없다*/
        /*Queue que=new Queue();*/

        Queue<String> queue = new LinkedList<String>();
        // 질문: add도 되는데???
        queue.add("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        queue.offer("fifth");
        System.out.println("queue = " + queue);
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());

        /* 설명: PriorityQueue
        *   PriorityQueue를 활용하면 선입선출 및 정렬의 개념을 사용할 수 있다*/
        Queue<String> que=new PriorityQueue<String>();
        // 내림 차순 정렬을 위해서는 생성자 안에 Collections.reverseOrder() 를 넣으면 된다
        /*Queue<String> que=new PriorityQueue<String>(Collections.reverseOrder());*/
        
        /* 설명: 입력과 동시에 정렬되는게 아니라 출려될 떄 정렬되는 것
        *   poll()로 인해 출력이 된다고 해도 자료형 전체가 정렬되어 저장되는 것은 아님*/
        
        que.offer("f");
        que.offer("a");
        que.offer("c");
        que.offer("d");
        que.offer("b");
        System.out.println("queue = " + que);
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);
    }
}
