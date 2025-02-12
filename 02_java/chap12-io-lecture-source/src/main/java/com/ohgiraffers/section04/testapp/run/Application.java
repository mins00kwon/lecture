package com.ohgiraffers.section04.testapp.run;

import com.ohgiraffers.section04.review_test_app.aggregate.Member;
import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.service.MemberService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application {

    private static final MemberService ms = new MemberService();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("====== 회원 관리 프로그램 ======");
            System.out.println("1. 모든 회원 정보 보기");
            System.out.println("2. 회원 찾기");
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 정보 수정");
            System.out.println("5. 회원 탈퇴");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해 주세요: ");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    ms.findAllMembers();
                    break;
                case 2:
                    ms.findMemberBy(chooseMemNo());
                    break;
                case 3:
                    ms.register(signUp());
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 9:
                    System.out.println("회원관리 프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }
        }
    }

    private static Member signUp() throws IOException {
        Member member = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("아이디를 입력하세요: ");
        String id = br.readLine();
        System.out.println();

        System.out.print("패스워드를 입력하세요: ");
        String pwd = br.readLine();
        System.out.println();

        System.out.print("나이를 입력하세요");
        int age = Integer.parseInt(br.readLine());
        System.out.println();

        System.out.print("입력할 취미의 갯수를 입력하세요(숫자는 1 이상): ");
        int len = Integer.parseInt(br.readLine());
        System.out.println();
        String[] hobbies = new String[len];
        for (int i = 0; i < len; i++) {
            System.out.print(i + 1 + "번째 취미를 입력하세요: ");
            hobbies[i] = br.readLine();
            System.out.println();
        }

        System.out.print("혈액형을 입력하세요(A, AB, B, O): ");
        BloodType bt = null;
        String bloodTypeInput = br.readLine().toUpperCase();
        switch (bloodTypeInput) {
            case "A":
                bt = BloodType.A;
                break;
            case "AB":
                bt = BloodType.AB;
                break;
            case "B":
                bt = BloodType.B;
                break;
            case "O":
                bt = BloodType.O;
                break;

        }

        System.out.println();

        member = new Member(id, pwd, age, hobbies, bt);
        return member;
    }

    /* 설명. 회원 번호를 입력 받아 int로 반환하는 메소드 */
    private static int chooseMemNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 번호를 입력하세요: ");
        return sc.nextInt();
    }
}
