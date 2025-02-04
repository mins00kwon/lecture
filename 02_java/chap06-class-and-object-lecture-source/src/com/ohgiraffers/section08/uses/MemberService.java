package com.ohgiraffers.section08.uses;

import java.util.Arrays;

public class MemberService {
    /* 설명: 회원 갑일 5명 진행하기 위해 회원 가입용 객체의 메소드를 호출*/
    public void signUpMembers() {
        Member[] members = new Member[5];
        members[0] = new Member(1, "user01", "pass01", "홍길동", 20, 'M');
        members[0] = new Member(2, "user02", "pass02", "김길동", 21, 'M');
        members[0] = new Member(3, "user03", "pass03", "윤길동", 22, 'M');
        members[0] = new Member(4, "user04", "pass04", "한길동", 23, 'M');
        members[0] = new Member(5, "user05", "pass05", "최길동", 24, 'M');

        MemberRegister register = new MemberRegister();
        register.regist(members);
    }

    public void showAllMembers() {
        MemberFinder finder = new MemberFinder();
        System.out.println("===== 가입된 회원 목록 =====");
        System.out.println(Arrays.toString(finder.findAllMembers()));
    }
}
