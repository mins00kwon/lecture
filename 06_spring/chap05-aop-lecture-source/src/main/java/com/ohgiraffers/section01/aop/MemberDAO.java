package com.ohgiraffers.section01.aop;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository // DB에서 에러 나면 자바 에러로 바꿔줌
public class MemberDAO {

    /* 설명: DB에서 조회되어 컬렉션에 담겼다는 가정*/
    private final List<MemberDTO> memberList;

    public MemberDAO() {
        this.memberList = new ArrayList<>();
        memberList.add(new MemberDTO(1L, "유관순"));
        memberList.add(new MemberDTO(2L, "홍길동"));
    }

    public List<MemberDTO> selectAllMembers() {
        return memberList;
    }
}
