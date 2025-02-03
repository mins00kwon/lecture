package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

/* 설명:
 *   추상화란?
 *       공통된 부분을 추출하고 공통되지 않고 불필요한 부분을 제거한다는 의미를 가지며
 *       추상황의 목적은 유연성을 확보하기 위함이다.
 *       유연성 확보는 여러 곳에 적용될 수 있는 유연한 객체를 의미하며,
 *       재사용성이 높아질 수 있게 한다는 의미이다
 *       (우리는 자연스럽게 추상화를 이루었지만, 그렇게 추상화된 클래스로 유연한 객체들을 생성할 수 있다.)*/

/* 설명:
 *   1. 협력
 *   2. 책임
 *   3. 역할
 * */

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarRacer racer = new CarRacer();
        Car car = new Car();

        int input = 0;
        do {
            System.out.println("-=-=- WELCOME TO CAR RACER -=-=-");
            System.out.println("Please enter your choice: ");
            System.out.println("1. Start Car");
            System.out.println("2. Stop Car");
            System.out.println("3. Accelerate Car");
            System.out.println("4. Decelerate Car");
            System.out.println("9. Exit");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    racer.startCar();
                    break;
                case 2:
                    racer.stopCar();
                    break;
                case 3:
                    racer.speedUp();
                    break;
                case 4:
                    racer.speedDown();
                    break;
                case 9:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        } while (input != 9);
    }
}
