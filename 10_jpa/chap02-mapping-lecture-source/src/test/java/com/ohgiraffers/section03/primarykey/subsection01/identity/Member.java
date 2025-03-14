package com.ohgiraffers.section03.primarykey.subsection01.identity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.Objects;

@Entity(name = "member_section03")
@Table(name="tbl_member_section03")     // db에는 없는 테이블. 이 과정에서 새로 만들어짐
public class Member {

    /* 설명:
    *   - IDENTITY: MySQL 또는 MariaDB의 auto_increment
    *   - SEQUENCE: 데이터베이스의 시퀀스 객체 사용(Oracle의 SEQUENCE)
    *   - TABLE: 키 생성 테이블 사용
    *   - AUTO: 자동 선택(MySQL이면 IDENTITY / Oracle이면 SEQUENCE)*/

    @Id
    @Column(name = "member_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 이거시 오토-인크리먼트
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
    private java.util.Date enrollDate;
    @Column(name="member_role")
    private String memberRole;
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

    public String getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(String memberRole) {
        this.memberRole = memberRole;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Member(int memberNo, String memberId, String memberPwd, String nickName, String phone, String email,
                  String address, Date enrollDate, String memberRole, String status) {
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
