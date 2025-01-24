package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    private Car myCar = new Car();

    public void startCar() {
        if (this.myCar.isTurnedOn()) {
            System.out.println("Car is already turned on");
        } else {
            this.myCar.startCar();
            System.out.println("Car is now on");
        }
    }

    public void stopCar() {
        if (this.myCar.isTurnedOn()) {
            this.myCar.stopCar();
            System.out.println("Car is now turned off");
        } else {
            System.out.println("Car is not turned on");
        }
    }

    public void speedUp() {
        this.myCar.accelerate();
    }

    public void speedDown() {
        this.myCar.decelerate();
    }
}
