package com.ohgiraffers.section01.list.dto;

import java.util.Objects;

public class BookDTO implements Comparable<BookDTO> {
    private int number;
    private String title;
    private String author;
    private int price;


    /* 설명:
    *   우리가 원하는 필드의 오름차순 또는 내림차순을 할 수 있다
    *   필드가 n개면 총 (n*2)가지의 정렬 기준을 가질 수 있다 (ASC / DESC)
    *   정렬은 compareTo() 메소드가 반환하는 int형의 부호에 따라 정해지게 되므로 오름차순과 내림차순은 부호만 다르게 설정하면 된다
    *   (해당 필드가 String 형일 경우는 String에 정의된 compareTo 메소드를 활용한다*/


    @Override
    public int compareTo(BookDTO o) {
        // 가격에 대한 오름차순
        /*return this.price-o.price;*/

        /* 설명: 가격에 대한 내림차순*/
//        return -(this.price - o.price);

        /* 설명: 챚 제목에 대한 오름차순*/
//        return this.title.compareTo(o.title);

        /* 설명: 책 제목에 대한 내림차순*/
        return -this.title.compareTo(o.title);
    }

    // region Constructor, Getter, Setter, toString()


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BookDTO bookDTO = (BookDTO) o;
        return price == bookDTO.price && Objects.equals(title, bookDTO.title) && Objects.equals(author,
                bookDTO.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public BookDTO() {
    }

    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    // endregion
}
