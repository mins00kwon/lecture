package com.ohgiraffers.section05.parameter;

public class ParameterTest {
    public void testPrimitiveTypeParameter(int num) {
        num = 10;
        System.out.println("매개변수로 전달받아 수정한 값: " + num);
    }

    public void testClassTypeParamter(Rectangle rectangle) {
        rectangle.calArea();
        rectangle.calRound();
    }

    public void testPrimitiveTypeParameter(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] *= 10;
        }
        /* 질문: 이건 왜 작동 안함?*/
//        for(int i:iArr){
//            i*=10;
//        }
    }
}
