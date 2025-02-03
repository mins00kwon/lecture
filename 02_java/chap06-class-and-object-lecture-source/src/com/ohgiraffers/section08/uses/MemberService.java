package com.ohgiraffers.section08.uses;

public class MemberService {
    public void signUpMembers() {
        Member[] members = new Member[5];
        members[0] = new Member(1, "user01", "pass01", "홍길동", 20, 'M');
        members[0] = new Member(2, "user02", "pass02", "김길동", 21, 'M');
        members[0] = new Member(3, "user03", "pass03", "윤길동", 22, 'M');
        members[0] = new Member(4, "user04", "pass04", "한길동", 23, 'M');
        members[0] = new Member(5, "user05", "pass05", "최길동", 24, 'M');
    }
}
