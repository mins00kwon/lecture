package com.ohgiraffers.section03.abstraction;

public class Car {
    private boolean isTurnedOn = false;
    private int speed;

    public void startCar() {
        this.isTurnedOn = true;
    }

    public void stopCar() {
        if (this.isTurnedOn) {
            System.out.println("Car is running. Can't stop car.");
        } else {
            this.isTurnedOn = false;
        }
    }

    public boolean isTurnedOn() {
        return this.isTurnedOn;
    }

    public void accelerate() {
        if (this.isTurnedOn) {
            this.speed += 10;
            System.out.println("accelerated. Current speed: " + this.speed);
        } else {
            System.out.println("This Car is not turned on.");
        }
    }

    public void decelerate() {
        speed = 0;
        System.out.println("decelerated. Current speed: " + this.speed);
    }
}
