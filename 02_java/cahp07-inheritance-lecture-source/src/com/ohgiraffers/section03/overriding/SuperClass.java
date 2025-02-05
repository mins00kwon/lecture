package com.ohgiraffers.section03.overriding;

import java.util.Objects;

/* 설명: class의 접근 제어자는 public/default 두가지가 있다
*   default는 아무것도 안쓰는게 default. default라고 앞에 쓰면 오류남*/
public class SuperClass {
    private int a;
    /* 목표: 오버라이딩에 대해 이해할 수 있다*/

    /* 설명: 멤버(필드/메소드) 들은 public/protected/default/private 네 가지가 있다*/

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SuperClass that = (SuperClass) o;
        return a == that.a;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a);
    }

    public void method(int num){
    }

    public Object method2(int num){
        return null;
    }

    private void privateMethod(){}

    public final void finalMethod(){}

    protected void protectedMethod(){}

    void defaultMethod(){}
}
