package com.ohgiraffers.section05.compositkey.subsection01.embedded;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity(name = "member_section05_subsection01")
@Table(name="tbl_member_section05_subsection01")
public class Member {

    @EmbeddedId
    private MemberPK memberPK;  // 실제로는 두개의 값이지만 MemberPK를 만들어서 하나로 대체
                                // 왜냐고? 문법입ㅇㅇ JPA 만든사람 맴임ㅋㅋ
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;

    @Override
    public String toString() {
        return "Member{" +
                "memberPK=" + memberPK +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Member member = (Member) o;
        return Objects.equals(memberPK, member.memberPK) && Objects.equals(phone, member.phone)
                && Objects.equals(address, member.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberPK, phone, address);
    }

    public MemberPK getMemberPK() {
        return memberPK;
    }

    public void setMemberPK(MemberPK memberPK) {
        this.memberPK = memberPK;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Member(MemberPK memberPK, String phone, String address) {
        this.memberPK = memberPK;
        this.phone = phone;
        this.address = address;
    }

    public Member() {
    }
}
