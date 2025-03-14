package com.ohgiraffers.section03.properties.subsection02.i18n;

import java.util.Locale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        /* 설명: i18n이란
        *   소프트웨어의 국제화 (Internationalization 에서 첫 글자인 I와 마지막 글자인 n 사이에 알파벳 개수가 18개
        *   소프트웨어를 구제화 하기 위해서는 처리해야 할 작업이 많이 있다
        *   1. 언어, 지역별 번역
        *   2. OS/Platform 별 인코딩
        *   3. 문자열 치환 방법
        *   4. 국제화 UI (문자열 크기 변화, 폰트, 아이콘 등)
        *   5. 쓰기 방향의 차이
        *   6. 숫자, 공백, 화폐, 날짜, 주소, 측정 단위 등
        *   7. 타임존, 섬머타임 등 시각
        *   8. 문자열 정렬 방법
        * */
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        String error404MessageKR= (String) context.getBean("error.404", null, Locale.KOREA);
        String error500MessageKR= (String) context.getBean("error.500", new Object[]{"여러분",new java.util.Date()}, Locale.KOREA);
        System.out.println("error404MessageKR = " + error404MessageKR);
        System.out.println("error500MessageKR = " + error500MessageKR);
        String error404MessageUS= (String) context.getBean("error.404", null, Locale.US);
        String error500MessageUS= (String) context.getBean("error.500", new Object[]{"you",new java.util.Date()}, Locale.US);
        System.out.println("error404MessageUS = " + error404MessageUS);
        System.out.println("error500MessageUS = " + error500MessageUS);
    }
}
