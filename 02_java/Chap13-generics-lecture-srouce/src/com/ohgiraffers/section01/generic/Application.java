package com.ohgiraffers.section01.generic;

public class Application {
    public static void main(String[] args) {
        MyGenericTest myGenericTest = new MyGenericTest();
        myGenericTest.setValue("Hello World");
        System.out.println(myGenericTest.getValue());
        myGenericTest.setValue(1);
        System.out.println(myGenericTest.getValue());
        myGenericTest.setValue(3.14);
        System.out.println(myGenericTest.getValue());
        // 출력은 괜찮음. value 를 받아와서 출력 자체는 문제 안되니까
        /*double myDouble = myGenericTest.getValue();*/ //
        // 다운캐스팅을 꼭 직접 해줘야 함
        // 다운캐스팅을 잘못된 타입으로 해도 컴파일 에러가 발생하지 않음
            // 컴파일 에러가 아닌 런타임 에러가 발생하는 "위험한" 구문.
        /* 설명: 이런 상황을 '타입의 안정성이 불안정하다' 고 표현함
        *   '이런 상황' 이란? 타입을 확인하고 정확하게 다운캐스팅 해줘야만 하는 상황
        *   반대로 '구현의 편리성' 은 좋다.*/
        double dNum=(Double) myGenericTest.getValue();

        /* 설명: 제네릭 클래스
        *   제네릭 클래스는 다양한 자료형으로 변할 수 있어 클래스 하나만으로 활용가치가 높다. (구현이 편하다)
        *   매개변수나 반환형도 제네릭 타입으로 지정되어 명확히 해당 타입에 대해 처리할 수 있다. (타입의 안정성)
        * */


        // 다이아몬드 연산자 안에 타입을 넣어서 하나의 클래스만 만들고도 같은 메소드 이름으로 같은 연산을 하도록 만들 수 있다.
        GenericTest<Integer> gt1= new GenericTest<Integer>();
        GenericTest<Double> gt2=new GenericTest<>();            // 다이아몬드 연산자는 타입을 한번만 작성하면 된다
        /*GenericTest<> gt3=new GenericTest<Double>();*/        // 왼쪽에 안쓰고 오른쪽에만 쓰는건 안된다
        gt1.setValue(10);
        gt1.getValue();         // 다이아몬드 연산자 안의 참조자료형을 반환하게 되는 것을 확인할 수 있다
//        gt1.setValue(2.0);    // 타입의 안정성이 높다 (다이아몬드 연산자 안 참조자료형을 위반하지 않는다)
                                // 잘못된 리턴타입을 제공하는 경우 컴파일 에러를 내준다.


    }
}
