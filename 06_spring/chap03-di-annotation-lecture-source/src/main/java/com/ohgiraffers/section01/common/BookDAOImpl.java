package com.ohgiraffers.section01.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements BookDAO {

    private Map<Integer, BookDTO> bookList;

    public BookDAOImpl() {
        bookList = new HashMap<>();
        bookList.put(1,new BookDTO(1,123456,"자바의 성적","성궁남","출판고래",new java.util.Date()));
        bookList.put(2,new BookDTO(2,654321,"자성의 바적","성남궁","고출래판",new java.util.Date()));
    }

    @Override
    public List<BookDTO> findAllBook() {
        /* 설명: Map을 ArrayList로 바꾸는 방법*/
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO findBookBySequence(int sequence) {
        return bookList.get(sequence);
    }
}
