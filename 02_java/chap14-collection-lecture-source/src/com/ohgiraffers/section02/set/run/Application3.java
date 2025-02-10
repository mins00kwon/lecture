package com.ohgiraffers.section02.set.run;

import static java.lang.Math.random;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    /* 목표: TreeSet 에 대해 이해하고 활용할 수 있다*/
    public static void main(String[] args) {
        /* 설명: Tree 구조를 활용해 중복 제거 + 정렬을 해준다*/
        Set<String> tSet = new TreeSet<String>();
        tSet.add("ramen");
        tSet.add("pork");
        tSet.add("kimchi");
        tSet.add("friedEgg");
        tSet.add("creamSoup");
        System.out.println("tSet = " + tSet);

        /* 설명: 로또 번호 발생기
        *   1부터 45까지 중복되지 않고 오름차순 정렬된 6개의 값 추출하기*/
        makeLottoCombinationWithArray();
    }
    public static void makeLottoCombination(){
        Set<Integer> lotto=new TreeSet<>();
        while(lotto.size()<6){
            lotto.add((int) (random()*45+1));
        }
        System.out.println("lotto = " + lotto);
    }
    /* 설명: 배열을 활용한 TreeSet과 같은 기능을 하는 알고리즘 구현해보기*/
    public static void makeLottoCombinationWithArray(){
        int[] arr=new int[6];
        int i=0, ranNum;
        boolean isSame=false;
        while(i<6){
            ranNum=(int)(random()*45+1);
            for(int j=0;j<i;j++){
                if(arr[j]==ranNum){
                    isSame=true;
                    break;
                }
            }
            if(isSame){
                isSame=false;
                continue;}
            else {
                arr[i]=ranNum;
            }
            isSame=false;
            i++;
        }
        Arrays.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
