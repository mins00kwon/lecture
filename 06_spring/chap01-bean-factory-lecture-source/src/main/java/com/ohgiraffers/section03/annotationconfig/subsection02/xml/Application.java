package com.ohgiraffers.section03.annotationconfig.subsection02.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/* 목표: xml 로도 스캔 범위를 지정할 수 있다*/
public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new GenericXmlApplicationContext("section03/annotationconfig/xml/spring-context.xml");
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
