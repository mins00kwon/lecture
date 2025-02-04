package com.ohgiraffers.section02.superkeyword;

public class Application {
    public static void main(String[] args) {
        /* 목표: super와 super() 에 대해 이해할 수 있다*/

        /* 설명:
        *   super. : 자식 클래스 타입의 객체가 생성될 때 먼저 생성된 부모 클래스 타입의 객체즤 주소값(참조값)을 통해 접근
        *   super(): 부모로부터 물려받지 못한 부모 클래스에 있는 생성자를 활용하기 위해 사용*/
        Product product1 = new Product();
        System.out.println(product1);

        Product product2 = new Product("Samsung", "SM572",new java.util.Date(),"BigBlackThing",672);
        System.out.println(product2);

        Computer computer1 = new Computer();
        System.out.println(computer1);

        Computer computer2 = new Computer("SK Hynix", 512, "MacOS", 1024);
        System.out.println(computer2);

        Computer computer3 = new Computer("Shaomi","Xi72",new java.util.Date(),"ZinPing",4695,"TienAnMoon",512,"ChingChangChong", 1962);
        System.out.println(computer3);
    }
}
