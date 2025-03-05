package com.ohgiraffers.chap01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    @Value("${test.value}")
    public String testValue;

    @Value("${test.gender}")
    public String testGender;

    @Value("${test.age}")
    public String testAge;


    @Value("${user}")
    public String userName;

    @Bean
    public Object propertyReadTest(){
        System.out.println("testValue = " + testValue);
        System.out.println("userName = " + userName);
        System.out.println("testGender = " + testGender);
        System.out.println("testAge = " + testAge);
        return new Object();
    }
}
