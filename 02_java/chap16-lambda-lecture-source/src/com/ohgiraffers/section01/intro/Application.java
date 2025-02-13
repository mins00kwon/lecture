package com.ohgiraffers.section01.intro;

public class Application {
    public static void main(String[] args) {
        /* 목표: 람다식에 대해 이해하고 활용할 수 있다
        *   feat. Functional Interface
        *   ="추상 메서드를 단 하나만 가지는 인터페이스"*/
        // 람다식을 만들려면 functional interface 를 먼저 정의해야 한다

        /* 목차: 1. 인터페이스를 구현하는 클래스로 하위 구현체를 만드는 방법(feat. 자식 클래스 필요) */
        /* 필기: 기존에 쓰던 방식.
        *   인터페이스를 바탕으로 클래스에서 구현하고 추상 메소드를 오버라이딩 해서 다형성으로 함수 사용 */
        Calculator cal=new CalculatorImpl();
        System.out.println("10과 20의 합은? "+ cal.sumTwoNumbers(10, 20));

        /* 목차: 2. 익명클래스를 활용한 방식(인터페이스 타입으로 하위 구현체 생성)
        *   =자식 클래스 없애기
        *   =생성자 호출과 동시에 메소드 오버라이딩*/
        /* 필기: 새로운 방식
        *   인터페이스 생성자를 호출하고 뒤에 중괄호를 넣고 그 안에서 오버라이딩
        *   이게 람다가 아니라 '익명클래스'라는걸 이용하는 방식인 듯
        *   한번 쓸 용도면 이렇게 하는것도 나쁘지 않다. 예전에는 많이 썼던 방식이라는 듯
        *   이제는 안 씀
        *   클래스를 따로 구현하지 않아도 된다는 장점(?)
        *   여기서 더 줄이는게 람다식*/
        Calculator cal2=new Calculator() {
            @Override
            public int sumTwoNumbers(int first, int second) {
                return first + second;
            }
        };
        System.out.println("10과 20의 합은? "+ cal2.sumTwoNumbers(10, 20));

        /* 목차: 3. 람다식을 활용한 방식
        *   =메소드 이름도 없애기*/

        /* 설명: 람다식
        *   람다식은 익명함수로 이름을 별도로 작성하지 않지만 인터페이스의 하위 구현체를 생성하여
        *   유일하게 있는 추상메소드를 오버라이딩 하는 개념이기 때문에 익명 함수가 가능하다
        *   즉, 람다식을 활용하기 위한 인터페이스는 추상 메소드를 단 하나만 가져야 한다
        *   그런 인터페이스를 Functional Interface 라고 한다*/

        /* 설명:
        *   기본 람다식 규칙
        *   1. 매개변수의 소괄호는 생략할 수 없다
        *       1-1. 매개변수가 하나면 소괄호 생략 가능
        *   2. 구현하는 메소드의 바디부분에서 실행 구문이 하나일 경우 중괄호를 생략할 수 있다
        *   3. 실행될 마지막 구문이 리터럴 형태로 끝나고 추상메소드에 반환형이 있을 경우 return 생략 가능*/

        /* 필기: 메소드 이
        *   메소드가 한개밖에 없으니까 메소드 이름이 필요하지 않음(인터페이스 이름으로만으로도 특정됨) */
//        Calculator cal3=(int first, int second)->{return first+second;};  /* 필기: 정석 */
//        Calculator cal3=( first,  second)->{return first+second;};  /* 필기: 매개변수의 타입 생략 가능 */
        Calculator cal3= (a,b)->a+b;  /* 필기: 한줄로 코드가 끝나면 리턴문과 중괄호 생략 가능 */
        System.out.println(cal3.sumTwoNumbers(40, 30));



    }
}
