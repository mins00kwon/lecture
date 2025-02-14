package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Application5 {
    public static void main(String[] args) {
        /* 설명: 메소드 참조 관련 추가 설명(람다식 관련)*/

        /* 필기: 여러 객체에 쓸 수 있음 */
        BiConsumer<Member, String> biConsumer;
        biConsumer =Member::setMemberId;
        biConsumer=(x,y)->x.setMemberId(y);

        /* 필기: 객체 하나에만 사용 가능하게 되어벌림 */
        Consumer<String> consumer;
        Member m=new Member("1", "홍길동");
        consumer=m::setMemberId;
        consumer=x->m.setMemberId(x);
//        /* 필기: /* 질문: consumer에 대입이.. 여러줄...?*/ */
    }
}
