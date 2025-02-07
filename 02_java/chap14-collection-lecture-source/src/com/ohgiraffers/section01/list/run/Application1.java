package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 컬렉션 프레임워크에 대해 이해할 수 있다
        *   List 부터*/
        /* 설명: 모든 컬렉션은 제네릭 타입이면 다이아몬드 연산자를 생략하면 <Object>인 상태다*/
//        ArrayList list = new ArrayList();
        List list=new ArrayList();           // 다형성 기능이 적용됨

        /* 설명: 데이터를 넣은 순서를 기억한다*/
        /* 설명: 갑 넣기*/
        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(new java.util.Date());

        /* 설명: 리스트 출력
            모든 컬렉션은 toString()이 잘 오버라이딩 되어 쉽게 출력해 볼 수 있다*/
        System.out.println(list);

        /* 설명: 값 빼오기*/
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1) = " + list.get(1));


        /* 설명: 리스트가 수정되면 이후 요소들의 위치가 영향을 받음*/

        /* 설명: 리스트 수정(1) 값 끼워넣기*/
        list.add(1, 19);
        System.out.println(list);

        /* 설명: 리스트 수정(2) 인덱스로 값 바꾸기*/
        list.set(0,"Banana");
        System.out.println(list);

        /* 설명: 리스트 수정(3) 인덱스로 값 지우기*/
        list.remove(0);
        System.out.println(list);

        /* 설명: 배열보다 ArrayList가 좋은 점
        *   1. 미리 크기를 할당할 필요가 없다
        *   2. 들어있는 값의 갯수를 잘 파악할 수 있다. (size())
        *   3. 제네릭 타입을 생략하면 다양한 값을 한 리스트에 저장할 수 있다
        *   4. 중간에 값을 추가 및 삭제가 용이핟*/

        /* 설명: 컬렉션 대신 배열로 한번 중간에 값 추가 연습해 보기*/
        System.out.println("\n/* 설명: 컬렉션 대신 배열로 한번 중간에 값 추가 연습해 보기*/\n");
        int[] arr=new int[5];
        for(int i=0;i< arr.length;i++){
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
        arr=insertArr(arr,5,100);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] insertArr(int[] arr,int index, int value){
        int[] resultArr=new int[arr.length+1];
        for(int i=0;i<index;i++){
            resultArr[i]=arr[i];
        }
        resultArr[index]=value;
        for(int i=index;i<arr.length;i++){
            resultArr[i+1]=arr[i];
        }
        return resultArr;
    }
}
