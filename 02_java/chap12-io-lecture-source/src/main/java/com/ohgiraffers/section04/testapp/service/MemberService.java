package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.aggregate.AccountStatus;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.repository.MemberRepository;
import java.util.ArrayList;

/* 설명. 트랜잭션 처리(성공 실패에 따라 commit/rollback) 및 회원관리 비즈니스 로직 처리 */
public class MemberService {

    private final MemberRepository mr = new MemberRepository();

    public MemberService() {
    }

    public void findAllMembers() {
        ArrayList<Member> findMembers = mr.selectAllMembers();

        System.out.println("Service에서 조회 확인: ");
        for (Member member : findMembers) {
            System.out.println(member);
        }
    }

    public void findMemberBy(int memNo) {

    }

    /* 설명: 회원가입 시 입력받은 값 제외 두개를 마저 채워준다*/
    public void register(com.ohgiraffers.section04.review_test_app.aggregate.Member member) {
        // 1. 회원 번호 추가
        int lastMemNo = mr.selectLastMemberNo();
        member.setMemNo(lastMemNo + 1);

        // 2. 회원 활성호 상태 추가
        member.setAccountStatus(AccountStatus.ACTIVE);

        /* 설명: 모든 DML 작업(Insert/Update/Delete)은 작업이 일어난 행(객체)의 수가 리턴된*/
        int result = insertMember(member);
    }
}
