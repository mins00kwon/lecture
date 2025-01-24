package com.ohgiraffers.section1.array;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 배열에 대해 이해하고 배열의 사용 목적을 이해할 수 있다*/
        int num1=10;
        int num2=20;
        int num3=30;
        int num4=40;
        int num5=50;

        int sum=0;

        sum+=num1;
        sum+=num2;
        sum+=num3;
        sum+=num4;
        sum+=num5;
        System.out.println(sum);
        
        
        /* 설명: 자바는 반드시 배열의 크기를 지정해야 함*/
        /* 설명: 자바는 크기만 지정해도 쓰레기값이 저장되는게 아니라 초기값이 저장됨*/
        
        int[] arr=new int[5];

        /* 설명: 그냥 toString 찍으면 주소값이 String으로 보임*/
        int[] arr1=new int[5];
        System.out.println("arr1.toString() = " + arr1.toString());
        
        /* 설명: 1차원 배열만 사용 가능*/
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

        /* 설명: 2차원에 쓰면 1차원 배열에 각 배열의 주소값이 들어가있는게 보임*/
        int[][] dopArr=new int[4][4];
        System.out.println("Arrays.toString(dopArr) = " + Arrays.toString(dopArr));

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        for(int i=0;i<4;i++){
            arr[i]=(arr1[i]+1)*10;
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }
}
