package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;
import java.util.Comparator;

/* 설명: BookDTO에 대해 추가적인 정렬 기준(가격 오름차순)을 위한 클래스*/
// 제네릭을 써주지 않으면 메소드 오버라이딩 할 때 일일히 다운캐스팅 해줘야 함.
public class AscendingPrice implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
