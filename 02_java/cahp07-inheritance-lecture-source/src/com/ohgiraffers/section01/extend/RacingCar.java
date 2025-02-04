package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {
    @Override
    public void run() {
        System.out.println("레이싱 자동차가 달립니다~ 씨우우우우우웅");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적 따위 울리지 않습니다.");
    }
}
