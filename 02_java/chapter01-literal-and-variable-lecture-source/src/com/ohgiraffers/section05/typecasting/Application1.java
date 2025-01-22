package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {

        /* 목표: 자동 형변환 규칙에 대해 이해할 수 있다*/
        byte bNum = 1;                //사실 예외적인 부분이라는 것ㅋㅋ
        // int 를 byte 에 담지만 단순 리터럴이라 봐줌
        short sNum = bNum;

        int iNum = sNum;

        /* 설명: 연산 시에도 자동으로 큰 자료형에 맞춰서 낮은 자료형이 자동형변환 됨*/
        int num1 = 10;
        long num2 = 20L;

        long result1 = num1 + num2;       // num1 앞에 보이지 않는 (long) 이 자동으로 달린다고 생각하면 됨
//        int result2=num1+num2;        //바로 오류나쥬?

        /* 설명:문자형은 int 형으로 자동 현변환이 가능하므로 유니코드 겟또다제 가능 */
        int unuNum = 'f';               //햐 이거 좀 섹시하다ㅋㅋ
        System.out.println("unuNum = " + unuNum);
    }
}
