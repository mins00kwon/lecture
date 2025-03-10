package com.ohgiraffers.section01.xmlconfig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        MenuController mc = new MenuController();
        do {
            System.out.println("====== 메뉴 관리 ======");
            System.out.println("1. 메뉴 전체 조회");
            System.out.println("2. 메뉴 코드로 메뉴 조회");
            System.out.println("3. 신규 메뉴 추가");
            System.out.println("4. 메뉴 수정");
            System.out.println("5. 메뉴 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 관리 번호를 입력하세요: ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    mc.findAllMenus();
                    break;
                case 2:
                    mc.findMenuByMenuCode(inputMenuCode());
                    break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 9:
                    System.out.println("프로그램을 종료하겠습니다.");
                    return;
                default:
                    System.out.println("번호를 잘 확인하고 입력해 주세요");
            }
        } while(true);
    }

    /* 설명: 사용자의 입력 값을 맵 형태로 반환*/
    /* 필기: SpringBoot의 request의 parameter 개면을 흉내낸 것 */
    private static Map<String, String> inputMenuCode() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("조회할 메뉴를 입력하세요: ");
        String menuCode = br.readLine();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("menuCode", menuCode);
        return parameter;
    }
}