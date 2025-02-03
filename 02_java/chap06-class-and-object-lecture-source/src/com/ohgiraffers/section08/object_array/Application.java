package com.ohgiraffers.section08.object_array;

public class Application {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("페라리", 300);
        cars[1] = new Car("람보르기니", 510);
        cars[2] = new Car("롤스로이스", 250);
        cars[3] = new Car("부가티", 400);
        cars[4] = new Car("포터", 500);
        for (Car car : cars) {
            car.driveMaxSpeed();
        }
    }
}
