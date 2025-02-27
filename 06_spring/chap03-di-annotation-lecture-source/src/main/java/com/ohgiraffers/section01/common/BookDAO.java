package com.ohgiraffers.section01.common;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDAO {
    List<BookDTO> findAllBook();

    BookDTO findBookBySequence(int sequence);
}
