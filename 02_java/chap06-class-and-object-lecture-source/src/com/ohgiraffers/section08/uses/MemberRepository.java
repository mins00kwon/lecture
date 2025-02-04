package com.ohgiraffers.section08.uses;

public class MemberRepository {
    private final static Member[] staticMembers = new Member[100];
    private static int count;

    // 질문: final이면 수정 안되는거 아님? 값을 어떻게 더 넣음?
    public static void store(Member[] members) {
        for (int i = 0; i < members.length; i++) {
            staticMembers[count++] = members[i];
        }
    }

    public static Member[] findAllMembers() {
        return staticMembers;
    }
}
