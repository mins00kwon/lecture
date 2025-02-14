package com.ohgiraffers.section02.uses.subsection03.terminal;

public class Member {
    private String memberId;
    private String memberName;

    // region Constructor
    public Member() {
    }

    public Member(String memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }
    // endregion
    // region toString

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    // endregion
    // region

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    // endregion
}
