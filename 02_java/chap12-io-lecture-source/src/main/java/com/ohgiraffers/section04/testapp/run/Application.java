package com.ohgiraffers.section04.testapp.run;

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.service.MemberService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application {

    private static final MemberService ms = new MemberService();

    public static void main(String[] args) throws IOException {

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
                    ms.registMember(signUp());
                    break;
                case 4:
                    Member selected = ms.findMemberForMod(chooseMemNo());
                    if (selected == null) {
                        System.out.println("회원 번호를 다시 입력하세요...");
                        continue;
                    }
                    ms.modifyMember(reform(selected));
                    break;
                case 5:
                    ms.removeMember(chooseMemNo());
                    break;
                case 9:
                    System.out.println("회원관리 프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }
        }
    }

    /* 설명: 회원 수정 페이지*/
    private static Member reform(Member modifyMember) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("-=-=-=- 회원 수정 메뉴 -=-=-=-");
            System.out.println("1. 패스워드");
            System.out.println("2. 나이");
            System.out.println("3. 취미");
            System.out.println("4. 혈액형");
            System.out.println("9. 메인 메뉴로 돌아가기");
            System.out.print("내용을 선택하세요: ");
            int chooseNo = Integer.parseInt(br.readLine());
            switch (chooseNo) {
                case 1:
                    System.out.print("수정할 패스워드를 입력하세요: ");
                    modifyMember.setPwd(br.readLine());
                    break;
                case 2:
                    System.out.print("수정할 나이를 입력하세요: ");
                    modifyMember.setAge(Integer.parseInt(br.readLine()));
                    break;
                case 3:
                    System.out.print("수정할 취미를 입력하세요: ");
                    // 배열은 단순 Scanner로 입력 불가능
                    modifyMember.setHobbies(resetHobbies());
                    break;
                case 4:
                    System.out.print("수정할 혈액형을 입력하세요: ");
                    // enum type 은 단순 입력 불가능
                    modifyMember.setBloodType(resetBloodType());
                    break;
                case 9:
                    System.out.println("메인 메뉴로 돌아깁니다.");
                    return modifyMember;
                default:
                    System.out.println("잘못된 번호를 입력했습니다. 다시 입력해주세요");
            }
        }
    }

    private static BloodType resetBloodType() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("수정할 혈액형을 입력하세요(A, AB, B, O): ");
        String bloodType = br.readLine().toUpperCase();
        return switch (bloodType) {
            case "A" -> BloodType.A;
            case "AB" -> BloodType.AB;
            case "B" -> BloodType.B;
            case "O" -> BloodType.O;
            default -> null;
        };
    }

    private static String[] resetHobbies() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("수정할 취미의 갯수를 입력하세요(숫자는 1 이상): ");
        int length = Integer.parseInt(br.readLine());
        String[] hobbies = new String[length];
        for (int i = 0; i < hobbies.length; i++) {
            System.out.print((i + 1) + "번째 취미를 입력하세요: ");
            String input = br.readLine();
            hobbies[i] = input;
        }
        return hobbies;
    }

    private static Member signUp() {
        Member member = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요: ");
        String id = sc.nextLine();

        System.out.print("패스워드를 입력하세요: ");
        String pwd = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.print("입력할 취미의 갯수를 입력하세요(숫자는 1 이상): ");
        int length = sc.nextInt();
        sc.nextLine();      // 버퍼에 남은 엔터 제거용

        String[] hobbies = new String[length];
        for (int i = 0; i < hobbies.length; i++) {
            System.out.print((i + 1) + "번째 취미를 입력하세요: ");
            String input = sc.nextLine();
            hobbies[i] = input;
        }

        System.out.print("혈액형을 입력하세요(A, AB, B, O): ");
        String bloodType = sc.nextLine().toUpperCase();
        BloodType bt = switch (bloodType) {
            case "A" -> BloodType.A;
            case "AB" -> BloodType.AB;
            case "B" -> BloodType.B;
            case "O" -> BloodType.O;
            default -> null;
        };

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
