package com.ohgiraffers.section05.calender;

import java.text.SimpleDateFormat;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: java.util.Date 클래스 사용법을 이해하고 활용할 수 있다*/
        java.util.Date today = new java.util.Date();
        System.out.println("today = " + today);

        System.out.println("long 타입 시간: "+today.getTime());
        System.out.println("long 타입 시간을 활용한 Date: "+new java.util.Date(0L));
        System.out.println("long 타입 시간을 활용한 Date2: "+new java.util.Date(today.getTime()));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEEEE");// 질문 이거 규칙 도대체 뭐임?
        String todayformat = sdf.format(today);
        System.out.println("todayformat = " + todayformat);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EE요일");
        String todayformat2 = sdf2.format(today);
        System.out.println("todayformat2 = " + todayformat2);

        /* 설명: java.util.Date -> java.sql.Date*/
        java.util.Date today2 = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(today2.getTime());

        /* 설명: java.sql.Date -> java.util.Date*/
        java.util.Date today3=sqlDate;                  // 다형성 자동 형변환 적용
        // sql.Date는 util.Date를 상속받음
    }
}
