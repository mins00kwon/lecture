package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.dto.BookDTO;

public class Application1 {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO("허균",123,19000,"홍길동전");
        BookDTO book2 = new BookDTO("허균",123,19000,"홍길동전");
        System.out.println("두 인스턴스를 == 연산자로 비교: "+ (book1==book2));                 // 동일 비교: 주소 값이 같냐?
        System.out.println("두 인스턴스를 .equals() 메소드로 비교: "+ (book1.equals(book2)));   // 동등 비교: 비교하려는 값이 같냐

        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());
    }
}
