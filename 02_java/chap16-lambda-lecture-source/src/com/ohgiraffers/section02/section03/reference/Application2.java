package com.ohgiraffers.section02.section03.reference;
import java.util.function.Function;
import java.util.function.Supplier;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: 기존에 존재하는 생성자를 참조한 람다식을 활용할 수 있다*/

        /* 필기: 아래 두 줄은 동일한 기능을 함 */
        Function<String, Member> memberConstructor=x -> new Member(x);
        Function<String, Member> costMember= Member::new;

        /* 필기: 매개변수 없는놈도 만들어봄
        *   캬 선생님도 해주시!*/
        Supplier<Member> supplier=Member::new;

        /* 필기: 이유 없이 이따구로 코드 짜면 그 코드는 사직서와 다름이 없음 */

        Member member1=costMember.apply("ABC");
        Member member2=memberConstructor.apply("ABCDE");
        Member member3=supplier.get();
        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);
        System.out.println("member3 = " + member3);
    }
}
