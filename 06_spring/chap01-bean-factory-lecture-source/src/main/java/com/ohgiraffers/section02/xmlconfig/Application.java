package com.ohgiraffers.section02.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        /* 설명: 컨테이너에 들어있는 모든 bean의 이름(id) 확인*/
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        /* 설명: 1. bean의 id를 가지고 컨테이너에서 추출*/
        MemberDTO member=(MemberDTO)context.getBean("member");
        System.out.println("member = " + member);
    }
}
