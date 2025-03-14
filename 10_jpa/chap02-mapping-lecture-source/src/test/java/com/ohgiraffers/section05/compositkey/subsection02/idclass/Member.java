package com.ohgiraffers.section05.compositkey.subsection02.idclass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import java.util.Objects;
@Entity(name="member_section05_subsection02")
@Table(name="tbl_member_section05_subsection02")
@IdClass(MemberPK.class)        /* 필기: 요렇게 등록하는 것이구만
                                    근데 굳이 클래스를 새로 만들어야 함? 설계자 빠가*/
public class Member {
    @Id
    @Column(name = "member_no")
    private int memberNo;
    @Id
    @Column(name="member_id")
    private String memberId;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
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

    @Override
    public String toString() {
        return "Member{" +
                "memberNo=" + memberNo +
                ", memberId='" + memberId + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    public Member(int memberNo, String memberId, String phone, String address) {
        this.memberNo = memberNo;
        this.memberId = memberId;
        this.phone = phone;
        this.address = address;
    }

    public Member() {
    }
}
