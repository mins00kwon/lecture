package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

    /* 설명: 부모 메소드의 예외 클래스와 같은 레벨일 땐 문제 없음*/
    /*@Override
    public void method() throws IOException {
        super.method();
    }*/

    /* 설명: 부모 메소드와 달리 예외를 발생시키지 않아도 문제되지 않음
    *   부모 메소드를 기준으로 외부 클래스들이 작성이 되어있을것이므로*/
    /*@Override
    public void method(){
    }*/

    /* 설명: 부모 메소드보다 더 낮은 레벨(자식 예외 클래스)를 발생시켜도 문제되지 않음
    *   부모 메소드를 기준으로 외부 클래스들이 작성이 되어있으므로*/
    /*@Override
    public void method() throws FileNotFoundException {
    }*/

    /* 설명: 부모 메소드보다 더 높은 레벨(부모 예외 클래스)를 발생시키면 문제가 발생함
    *   부모 메소드를 기준으로 예외처리한 클래스에서 호출했는데 걔네 입장에서 감당 안되는 예외 발생*/
    /*@Override
    public void method() throws Exception {
    }*/
}
