package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {
        /* 목표: 여러개의 전달인자를 이용한 메소드 호출을 할 수 있다*/
        Application4 app4 = new Application4();
        app4.testMethod("권민수",27,'M');      // char 형에  한글도 들어간다
        String name="유관순";
        int age=20;
        char gender='F';
        app4.testMethod(name,age,gender);                       // 파라미터 세개를 달라고 했으면 전달인자도 무조건 세개 줘야함
    }
    public void  testMethod(String name, int age, final char gender) {
        System.out.println("당신의 이름은 "+ name+"이고, "+
                            "나이는 "+age +"세 이며, "+
                            "성별은 "+((gender=='F')?"여자":"남자")+"입니다.");
    }
}
