package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

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
