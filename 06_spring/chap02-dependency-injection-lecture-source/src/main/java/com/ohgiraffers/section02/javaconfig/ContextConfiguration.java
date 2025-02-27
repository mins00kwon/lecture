package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.commom.Account;
import com.ohgiraffers.commom.MemberDTO;
import com.ohgiraffers.commom.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    @Bean
    public Account accountGenerator(){
        return new PersonalAccount(20,"3333-04847-5514");
    }
    @Bean
    public MemberDTO memberGenerator(){
       /* 설명: setter 주입
        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("홍길동");
        member.setPhone("010-1111-2222");
        member.setEmail("ohgiraffers@gmail.com");
        member.setPersonalAccount(accountGenerator());
        return member;
        */
        /* 설명: 생성자 주입*/
        return new MemberDTO(1,"홍길동","0107266-3733","hong@gmail",accountGenerator());
    }
}
