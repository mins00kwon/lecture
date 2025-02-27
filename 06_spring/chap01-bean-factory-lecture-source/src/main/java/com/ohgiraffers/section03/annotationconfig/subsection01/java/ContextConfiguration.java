package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import com.ohgiraffers.common.MemberDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;

@Configuration
/* 필기: 여기에 탐색할 범위를 설정함
*   얘가 해당 범위를 탐색하다가 콩 어노테이션이 붙어있는 애를 콩으로 만들어줌 */

/* 설명: section 03에서는 ComponentScan 과 관련하여 java 클래스에서 @ComponentScan 범위를
*   bean으로 등록하는 방법을 다룬다
*   실제 bean으로 등록할 때 자주 쓰는션어노테이*/

/* 설명: 1. 기본적으로는 설정파일이 있는 패키지 및 하위만 Scan하지만, basePackages를 바꾸면 상위 범위까지 스캔 가능*/
//@ComponentScan(basePackages = "com.ohgiraffers")

/* 설명: 2. */
@ComponentScan(basePackages = "com.ohgiraffers",
                excludeFilters = {
                    @ComponentScan.Filter(
                            /* 설명: 2-1. 타입으로 설정*/
                            /*type= FilterType.ASSIGNABLE_TYPE,
                            classes = {MemberDAO.class}*/
                            /* 설명: 2-2. 어노테이션 종류로 설정*/
                            type=FilterType.ANNOTATION,
                            classes = Repository.class
                    )
                })
public class ContextConfiguration {
}


