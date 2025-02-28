package com.ohgiraffers.section01.subsection03.constructor;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookServiceConstructor")
public class BookService {
    private final BookDAO bookDAO;    // BookService는 BookDAO에 의존하게 된다
                                // BookService에 BookDAO를 주입한다

    /* 필기: 생성자 주입을 활용하면 주입되는 객체 변수에 final 키워드를 붙일 수 있음
    *   이게 왜 좋은거냐
    *   의존 관계에 있는 객체가 생성되는 것이 확실함
    *       == 반드시 의존 관계의 객체가 생성된 채로 주입된다
    *   실수로 다른 객체가 들어가는 상황을 원천 봉쇄함 */
    /* 설명:
    *   BookDAO 타입의 빈 객체를 생성자를 통해 주입 받는다
    *   @Autowired 를 생성자에 작성하고 주입받을 타입으 bean 을 매개변수로 작성한다
    *       이 때 기본 생성자를 만들 수 없게 된다
    *
    *   설명
    *    생성자 주입의 이점
    *   1. 필드에 final 키워드를 사용할 수 있다. (오염 방지)
    *       - 예측이 가능해지고 코드 이해가 쉬워진다.
    *   2. 순환참조를 스프링 시작(컨테이너 생성 시)과 동시에 확인하고 에러를 발생시켜 준다
    *       - 에러는 빨리 뜨는게 좋은거임ㅎ
    *   3. field 주입 및 setter 주입의 단점을 보완
    *       - 필드 주입은 간결하지만 남용할 수 있고, 이후에 setter 없이는 수정 불가능
    *       - setter 주입은 불변 객체를 만들고자 함에 있어 문제가 발생할 수 있음.
    *           객체의 변경이 필요할 때만 setter 를 추가해, 가급적 변경의 여지를 남기지 않아야 함
    *   4. 테스트 코드 작성이 용이
    *       - mock 객체 주입이 용이하다
    * */
    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> findAllBook(){
        return bookDAO.findAllBook();
    }

    public BookDTO findBookBySequence(int sequence){
        return bookDAO.findBookBySequence(sequence);
    }
}
