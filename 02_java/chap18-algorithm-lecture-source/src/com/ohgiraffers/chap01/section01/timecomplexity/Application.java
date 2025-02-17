package com.ohgiraffers.chap01.section01.timecomplexity;

import java.util.Arrays;

/* 목표: 시간복잡도를 이해할 수 있다*/
/* 설명: 알고리즘 실행 시 입력 값이 증가함에 따라 연산이 걸리는 시간의 증가도를 나타낸다*/
public class Application {
    public static void main(String[] args) {
        int[] arr=new int[]{3,1,2,15,4,9,10,7};
//        System.out.println(getFirst(arr));
//        System.out.println(binarySearch(arr,9));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(reverse(arr)));
    }

    /* 설명: 상수 시간 0(1)
    *   입력값의 크기와 상관 없이 항상 일정한 시간이 걸리는 알고리즘*/
    /* 필기: 이게 링크드리스트라고 생각해보자
    *   arr[2] 를 찾으면 O(3) 라고 해야하나?
    *   '입력의 크기' 에 따라 달라지지 않으므로 그냥 상수 시간이고
    *   표기는 무조건 O(1) 로 함ㅇㅇ */
    private static int getFirst(int[] arr){
        return arr[0];
    }

    /* 설명: 로그 시간 O(long n)*/
    /*   입력값이 증가함에 따라 처리 시간이 로그만큼 증가하는 알고리즘
    *   대표적인 예시는 이지 탐색
    *   이진 탐색은 매 단계마다 탐색 범위를 절반으로 줄이며 O(log n)에 해당함
    *   (단 이는 정렬이 선행되어있어야 성립함)*/
    private static int binarySearch(int[] arr, int target) {
        /* 설명: 초기 세팅(배열을 오름차순으로 정렬)*/
        Arrays.sort(arr);       // n(log n) 이 소요되지만 지금은 무시
        /* 설명: 검색할 배열의 처음과 끝을 지칭하는 위치(인덱스)를 담은 변수 두개(두개의 포인터)*/
        int left = 0, right = arr.length - 1, mid = 0;
        while (left <= right)/* 필기: left가 rigth를 추월할 수 없다 */ {
            mid = left + (right - left) / 2; /* 필기: 어쩔 수 없이 소수점이 생겼다 날아감. 따라서 살짝 왼쪽을 기리킬 수 밖에 없음 */
            if(arr[mid] == target)/* 필기: 중앙값이 하필 우리의 타겟 값이라면 */{
                return mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /* 설명: 선형 시간 O(n)*/
    /*   입력값이 증가함에 따라 처리 시간이 선형적으로 증가하는 알고리즘
    *   배열의 모든 요소를 한 번씩 순회해야 하기 때문에 배열의 크기에 비례하는 시간이 필요함*/
    private static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    /* 설명: 지수 시간 O(2^n)*/
    /* 설명: 입력값이 증가함에 따라 시간이 기하급수적으로 증가하는 알고리즘
    *   재귀적으로 두 번씩 자신을 호출하므로 매우 비효율적인 시간 복잡도를 가진다*/
    private static int fibonacci(int n) {
        if(n<=1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
