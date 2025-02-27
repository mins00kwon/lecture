package com.ohgiraffers.section01.subsection02.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");
        BookService bookService=context.getBean("bookServiceSetter",BookService.class);
        System.out.println("bookService = " + bookService);
    }
}
