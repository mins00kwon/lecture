package com.ohgiraffers.section04.enumtype;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.Objects;

@Entity(name = "member_section04")
@Table(name="tbl_member_section04")     // db에는 없는 테이블. 이 과정에서 새로 만들어짐
public class Member {
    @Id
    @Column(name = "member_no")
    private int memberNo;
    @Column(name = "member_id")
    private String memberId;
    @Column(name="member_pwd")
    private String memberPwd;
    @Column(name="nickname")
    private String nickName;
    @Column(name="phone")
    private String phone;
    @Column(name="email")
    private String email;
    @Column(name="address")
    private String address;
    @Column(name="enroll_date")
    private Date enrollDate;

    /* 설명: Enum 타입은 숫자(ORDINAL)/이름(STRING) 두 가지 형태로 설정할 수 있다. (DB에 들어갈 값) */
    @Column(name="member_role")
    @Enumerated(EnumType.STRING)
    private RoleType memberRole;
    @Column(name="status")
    private String status;

    @Override
    public String toString() {
        return "Member{" +
                "memberNo=" + memberNo +
                ", memberId='" + memberId + '\'' +
                ", memberPwd='" + memberPwd + '\'' +
                ", nickName='" + nickName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", enrollDate=" + enrollDate +
                ", memberRole='" + memberRole + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Member member = (Member) o;
        return memberNo == member.memberNo && Objects.equals(memberId, member.memberId)
                && Objects.equals(memberPwd, member.memberPwd) && Objects.equals(nickName,
                member.nickName) && Objects.equals(phone, member.phone) && Objects.equals(email,
                member.email) && Objects.equals(address, member.address) && Objects.equals(enrollDate,
                member.enrollDate) && Objects.equals(memberRole, member.memberRole) && Objects.equals(
                status, member.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberNo, memberId, memberPwd, nickName, phone, email, address, enrollDate, memberRole,
                status);
    }

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

    public String getMemberPwd() {
        return memberPwd;
    }

    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public RoleType getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(RoleType memberRole) {
        this.memberRole = memberRole;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Member(int memberNo, String memberId, String memberPwd, String nickName, String phone, String email,
                  String address, Date enrollDate, RoleType memberRole, String status) {
        this.memberNo = memberNo;
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.nickName = nickName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.enrollDate = enrollDate;
        this.memberRole = memberRole;
        this.status = status;
    }

    public Member() {
    }
}
