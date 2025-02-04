package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal {
    @Override
    public void eat() {
        System.out.println("Rabbit eats grass");
    }

    @Override
    public void run() {
        System.out.println("Rabbit runs 깡총깡총");
    }

    @Override
    public void cry() {
        System.out.println("Rabbit cry 끼익끼익");
    }

    public void jump(){
        System.out.println("Rabbit jumps");
    }
}
