package review_test_app.run;

import com.ohgiraffers.section04.review_test_app.aggregate.Member;
import com.ohgiraffers.section04.review_test_app.service.MemberService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    /* 설명: 프로그램 실행과 동시에 MemberService 객체가 생성됨*/
    private static final MemberService ms = new MemberService();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            printSelectMenu();
            int input = Integer.parseInt(br.readLine());
            switch (input) {
                case 1:
                    ms.findALlMembers();
                    break;
                case 2:
                    ms.findMemberBy();
                    break;
                case 3:
//                    ms.register(signUp());
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("잘못된 입력입니다");
            }
        }
    }

    private static Member signUp() {

        return null;
    }

    private static void printSelectMenu() {
        System.out.println("-=-=-=-=- 회원 관리 프로그램 -=-=-=-=-");
        System.out.println("1. 모든 회원 정보 보기");
        System.out.println("2. 회원 번호로 회원 찾기");
        System.out.println("3. 회원 가입");
        System.out.println("4. 회원 정보 수정");
        System.out.println("5. 회원 탈퇴");
        System.out.println("9. 프로그램 종료");
        System.out.print("메뉴를 선택해 주세요: ");
    }
}
