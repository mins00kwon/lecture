package com.ohgiraffers.section01.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* 설명: 설정용 클래스*/
@Configuration  // 설정 파일이라는 어노테이션
public class ContextConfiguration {
    @Bean("member")
    public MemberDTO getMember(){
        return new MemberDTO(1,"user01","pass01","홍길동");
    }
}
