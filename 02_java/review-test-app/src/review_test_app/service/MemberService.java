package review_test_app.service;


import com.ohgiraffers.section04.review_test_app.aggregate.Member;
import com.ohgiraffers.section04.review_test_app.repository.MemberRepository;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 멤버와 관련된 서비스를 관리하는 클래스
public class MemberService {
    /* 설명: MemberService 객체 생성과 동시에 MemberRepository 객체가 생성됨*/
    private final MemberRepository mr = new MemberRepository();

    public void findALlMembers() {
        ArrayList<Member> allMembers = mr.selectAllMembers();
        System.out.println("Find all members");
        for (Member member : allMembers) {
            System.out.println(member);
        }
    }

    public void findMemberBy() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter member number: ");
        int memNo = Integer.parseInt(br.readLine());
        System.out.println("Find member by " + memNo);
        Member foundMember = mr.selectMemberBy(memNo);
        if (foundMember != null) {
            System.out.println(foundMember);
        } else {
            System.out.println("No member found by " + memNo);
        }
    }
}
