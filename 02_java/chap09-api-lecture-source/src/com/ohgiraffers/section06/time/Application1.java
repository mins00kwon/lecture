package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: time 패키지에서 제공하는 클래스들의 사용 방법을 이해할 수 있다*/
        LocalTime timenow=LocalTime.now();
        LocalTime timenow2 = LocalTime.of(14, 33, 20);
        System.out.println("timenow = " + timenow);
        System.out.println("timenow2 = " + timenow2);

        LocalDate dateNow = LocalDate.now();
        LocalDate dateOf = LocalDate.of(2025, 2, 5);
        System.out.println("dateNow = " + dateNow);
        System.out.println("dateOf = " + dateOf);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTimeNowOf = LocalDateTime.of(2025, 2, 5,14,33,22);
        System.out.println("dateNow = " + dateNow);
        System.out.println("dateOf = " + dateOf);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeOf=ZonedDateTime.of(dateOf,timenow2, ZoneId.of("Asia/Seoul"));
    }
}
