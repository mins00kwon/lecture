package com.ohgiraffers.chap02.section01.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 목표: 버블 정렬을 이해할 수 있다*/
/* 설명: 정렬 알고리즘
*   데이터를 특정 순서대로 배열하는데 사용한다. (일반적으로 배열의 정렬을 뜻함)*/
public class Application1 {
    public static void main(String[] args) throws IOException {
        /* 설명.
         *  문제 내용
         *   : N개의 정수가 주어졌을 때, 버블 정렬 알고리즘을 사용하여 오름차순으로 정렬하는 프로그램을 작성하시오.
         *  입력
         *   - 첫 번째 줄에 자연수 N(1 <= N <= 100)이 주어진다.
         *   - 두 번째 줄에 N개의 정수가 공백으로 구분되어 입력된다. 각 정수는 -10^9 이상, 10^9 이하이다.
         *  출력
         *   - 오름차순으로 정렬된 수열을 공백으로 구분하여 출력한다.
         *
         *  설명.
         *   예시 입력 1
         *     - 7
         *       34 23 5 24 1 9 12
         *   예시 출력 1
         *     - 1 5 9 12 23 24 34
         *
         *  설명.
         *   예시 입력 2
         *     - 6
         *       40 47 38 8 33 35
         *   예시 출력 2
         *     - 8 33 35 38 40 47
         * */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
