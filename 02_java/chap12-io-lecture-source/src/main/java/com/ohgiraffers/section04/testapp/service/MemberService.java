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

    public void registMember(Member member) {

        /* 설명. 회원가입 시 입력받은 값 제외 두개를 마저 채워준다. */
        /* 설명. 1. 회원 번호 추가 */
        int lastMemberNo = mr.selectLastMemberNo();
        member.setMemNo(lastMemberNo + 1);

        /* 설명. 2. 회원 활성화 상태 추가 */
        member.setAccountStatus(AccountStatus.ACTIVE);

        /* 설명. 모든 DML작업(Insert/Update/Delete)이 일어난 행(객체)의 갯수 */
        int result = mr.insertMember(member);
        System.out.println(((result == 1) ?
                ("회원가입을 축하합니다 " + member.getId() + "님~") : "회원가입에 실패하였습니다."));


    }

    public void findMemberBy(int memNo) {
        Member findMember = mr.selectMemberBy(memNo);

        if (findMember != null) {
            System.out.println("회원 조회 성공: " + findMember);
        } else {
            System.out.println(memNo + "번 회원은 없습니다.");
        }
    }

    public Member findMemberForMod(int memeNo) {
        Member selectedMember = mr.selectMemberBy(memeNo);
        // 조회 성공시 실행 구문
        if (selectedMember != null) {                                                 // service 계층의 의미가 없어짐
            /* 설명: 조회된 회원을 그대로 변환해서 수정하면 Repository의 컬렉션에 담긴 객체가 수정된다 (Call by Reference)
             *   따라서 우리는 사본을 만들어 Repository의 컬렉션이 오염되지 않도록 한다*/
            Member newInstance = new Member(selectedMember);
//            Member newInstance = new Member();
//            newInstance.setMemNo(selectedMember.getMemNo());
//            newInstance.setId(selectedMember.getId());
//            newInstance.setPwd(selectedMember.getPwd());
//            newInstance.setAge(selectedMember.getAge());
//
//            String[] copiedHobbies = selectedMember.getHobbies().clone();
//            newInstance.setHobbies(copiedHobbies);
//            newInstance.setBloodType(selectedMember.getBloodType());
//            newInstance.setAccountStatus(selectedMember.getAccountStatus());
            return newInstance;
        }
        // 조회 실패시 실행 구문
        else {
            System.out.println("회원 조회에 실패하였습니다. 회원 번호를 확인해주세요.");
        }
        return null;
    }
}
