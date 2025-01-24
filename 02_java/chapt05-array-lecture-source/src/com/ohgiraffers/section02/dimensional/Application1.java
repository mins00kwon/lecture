package com.ohgiraffers.section02.dimensional;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 다차원 배열의 구조를 이해하고 사용할 수 있다*/
        /* 설명:
        *   다차원 배열
    *       다차원 배열은 2차원 이상의 배열을 의미한다
    *       일반적으로 3차원 정도까지 고려한다(사람의 인지 범위*/

        /* 설명: [][] 두개 붙어있기만 하면 됨*/
        int[][] iArr1;      //제일 권장하는 방법
        int[] iArr2[];      //욕 먹는 방식
        int iArr3 [][];     //처맞는 방식

        iArr1=new int[3][2];        // 정변 배열
        iArr2=new int[3][];         // 가변 배열
        int num=0;
        /* 설명: 정변 배열*/
        for(int i=0;i<iArr1.length;i++){
            System.out.println("iArr1["+i+"] = " + iArr1[i]);
            for(int j=0;j<iArr1[i].length;j++){
                System.out.println("iArr1["+i+"]["+j+"] = " + iArr1[i][j]);
            }
        }

        /* 설명: 가변 배열. 다양한 길이의 1차원 배열을 넣을 수 있다*/
        iArr2[0]=new int[]{1,2,3};
        iArr2[1]=new int[]{1,2,42,1124,1,3};
        iArr2[2]=new int[]{1,2,264,2346,414,47245,3};

        /* 설명: 1차원 배열을 출력하는 구문을 관리되는 1차원 배열의 갯수만큼 진행*/
        for (int i=0;i<iArr2.length;i++){
            System.out.println("iArr2["+i+"] = " + Arrays.toString(iArr2[i]));
        }
    }
}
