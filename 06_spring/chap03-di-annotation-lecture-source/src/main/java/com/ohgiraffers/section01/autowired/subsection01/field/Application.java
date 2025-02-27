package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class Application {
    public static void main(String[] args) {
        /* 설명: Component Scan 개념의 basePackage 문자열을 넣으면
        *   따로 설정 파일 없이 ComponentScan 이 적용됨*/
        ApplicationContext context=
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");
        System.out.println(context.getBean("bookService"));

        /* 설명: 도서 목록 전체 조회 */
        BookService bookService=context.getBean(BookService.class);     /* 필기: 이걸 type으로 뽑는다고 말씀하심 */
        bookService.findAllBook().forEach(System.out::println);

        /* 설명: 도서 번호로 검색 후 출력 확인*/
        System.out.println(bookService.findBookBySequence(1));
        System.out.println(bookService.findBookBySequence(2));
    }
}
