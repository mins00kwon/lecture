package com.ohgiraffers.section08.uses;

public class MemberRegister {
    public void regist(Member[] members) {
        System.out.println("회원을 등록합니다.");
        for (Member member : members) {
            System.out.println(member.getName() + "님, 회원 가입을 축하드립니다.");
        }
        MemberRepository.store(members);
    }
}
