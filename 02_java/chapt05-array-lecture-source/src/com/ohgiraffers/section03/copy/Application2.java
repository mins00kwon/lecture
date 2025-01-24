package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: 깊은 복사에 대해 이해할 수 있다*/
        /* 설명: 깊은 복사를 하는 방법은 4가지가 있다
         *   1. for문을 이용한 동일한 인덱스 값들끼리 일일이 복사
         *   2. Object의 clone()을 이용한 복사(사용 빈도 높음)
         *   3. System의 arraycopy()를 이용한 복사
         *   4. Arrays의 copyOf 를 이용한 복사*/
        int[] originArr=new int[]{1,2,3,4,5};
        print(originArr, "원본");

        /* 설명: for 문을 활용하는 방법*/
        int[] copyArr1=new int[originArr.length];
        for(int i=0; i<originArr.length; i++){
           copyArr1[i]=originArr[i];
        }
        print(copyArr1,"for 문을 활용한 복사문");

        /* 설명: clone() 활용*/
        int[] copyArr2=originArr.clone();
        print(copyArr2,"clone() 을 활용한 복사본");

        /* 설명: arraycopy()를 이용한 복사*/
        int[] copyArr3=new int[originArr.length+3];
        System.arraycopy(originArr,0,copyArr3,3,3);
        print(copyArr3, "arraycopy()를 활용한 사본");

        /* 설명: copyOf()를 이용한 복사(처음부터 원하는 길이만큼)*/
        int[] copyArr4=Arrays.copyOf(originArr,2);
        print(copyArr4,"Arrays.copyof()를 활용한 복사본");

    }
    public static void print(int[] arr, String desc){
        System.out.println("+++++"+desc+"+++++");
        System.out.println("넘어온 배열의 hashCode: "+arr.hashCode());
        System.out.println("arr = " + Arrays.toString(arr));
    }

}
