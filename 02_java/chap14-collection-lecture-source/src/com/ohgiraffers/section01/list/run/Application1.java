package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 컬렉션 프레임워크에 대해 이해할 수 있다
        *   List 부터*/
        /* 설명: 모든 컬렉션은 제네릭 타입이면 다이아몬드 연산자를 생략하면 <Object>인 상태다*/
//        ArrayList list = new ArrayList();
        List list=new ArrayList();           // 다형성 기능이 적용됨

        /* 설명: 데이터를 넣은 순서를 기억한다*/
        /* 설명: 값 넣기*/
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
        studySort();
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
    public static void studySort(){
        /* 설명: ArrayList를 활용한 정렬
         * 목차: 1. 문자열 데이터 정렬(feat. 오름차순) */
        List<String> stringList=new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grapes");
        System.out.println("stringList = " + stringList);

        /* 설명: 실제로는 ArrayList 안에 있는 데이터인 String에 정의된 기준(오름차순)대로 정렬 됨*/
        Collections.sort(stringList);
        System.out.println("stringList = " + stringList);
    }
    public static void studyIterator(){
        /* 목차: 1-1. 문자열 데이터 내림차순 정렬 */
        /* 설명: 내림차순 할 때는 LinkedList로 변경
        *   다루는 Iterator 와 해당 컬렉션의 제네릭 타입은 꼭 명시하자
        *       이유: 다운캐스팅 방지(타입 안정성)
        *           질문: 이게 머선 소리고*/
        List<String> stringList=new LinkedList<>();
        // region 값 대입
        stringList.add("apple");
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grapes");
        // endregion
        // List에는 없는 기능이기 떄문에 굳이 LinkedList로 형변환 함
        Iterator<String> iter=((LinkedList<String>)stringList).descendingIterator();
        // 작동 방식을 StringTokenizer랑 유사함
        // 반복문을 쓸 수 없음
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
