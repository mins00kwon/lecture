package com.ohgiraffers.section05.calender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {
        /* 목표 java.util.Calender 클래스 사용법을 이해하고 사용할 수 있다*/
        /* 설명: Date형 대비 개선점
        *   1. Timezone과 관련된 기능이 추가되었다
        *   2. 윤년 관련 기능이 내부적으로 추가되었다
        *   3. 날짜 및 시간 필드 개념을 추가해 불필요한 메소드명을 줄였다*/
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        Calendar calendar2 = new GregorianCalendar();
        System.out.println("calendar2 = " + calendar2);

        int year=1997;
        int month=9;
        int dayOfMonth=18;
        int hour=23-1;
        int minute=39-1;
        int second=59-1;
        Calendar birthday=new GregorianCalendar(year,month,dayOfMonth,hour,minute,second);
        System.out.println("birthday = " + birthday);

        System.out.println(birthday.get(Calendar.YEAR));
        System.out.println(birthday.get(Calendar.MONTH));
        System.out.println(birthday.get(Calendar.DAY_OF_MONTH));
        System.out.println(birthday.get(Calendar.DAY_OF_WEEK));


        // 이 부분 선생님 코드 풀 땡겨서 받아와서 하나씩 보자
    }
}