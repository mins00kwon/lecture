package com.ohgiraffers.section01.javaconfig;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        // 이 코드는 '우리가 만든 설정으로' 컨테이너를 만드는 코드
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        /* 필기: 컨테이너를 만들면 기본적으로 생성되는 콩들이 있다
        *   출력을 해서 어떤 콩들이 기본적으로 생성되는지 살펴보자
        *  */
        String[] beanNames=context.getBeanDefinitionNames();
        Arrays.stream(beanNames).forEach(System.out::println);
    }
}
