package com.ohgiraffers.section01.field.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    /* 설명:
    *   아래의 세 가지는 ComponentScan 범위 안에 어노테이션이 달렸을 때 유효하다
    *   1. @Service에 의해서 BookService 타입의 bookService id의 bean이 관리된다
    *   2. BookDAOImpl에 있는 @Repository에 의해서 bookDAOImpl id의 bean이 관리된다.(BookDAO 타입이기도 하다.)
    *   3. @Autowired에 의해서 bookDAO 타입의 bean이 BookService의 필드인 bookDAO 필드에 주입된다(대입된다)
    *       =필드 주입
    * */
    @Autowired
    private BookDAO bookDAO;

    public BookService() {
    }

    public List<BookDTO> findAllBook(){
        return bookDAO.findAllBook();
    }

    /* 설명: 도서 번호로 도서 조회 */
    public BookDTO findBookBySequence(int sequence) {
        return bookDAO.findBookBySequence(sequence);
    }
}
