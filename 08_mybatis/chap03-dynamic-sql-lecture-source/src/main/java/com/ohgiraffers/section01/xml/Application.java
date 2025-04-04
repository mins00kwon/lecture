package com.ohgiraffers.section01.xml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Application {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("======= 마이바티스 동적 SQL =======");
            System.out.println("1. if 확인하기");
            System.out.println("2. choose(when, otherwise) 확인하기");
            System.out.println("3. foreach 확인하기");
            System.out.println("4. trim(where,set) 확인하기");
            System.out.println("9. 종료하기");
            System.out.print("메뉴를 선택하세요: ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    ifSubMenu();
                    break;
                case 2:
                    chooseSubMenu();
                    break;
                case 3:
                    forEachSubMenu();
                    break;
                case 4:
                    trimSubMenu();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }
        } while (true);
    }

    private static void trimSubMenu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MenuService ms = new MenuService();
        do {
            System.out.println("======= trim 서브 메뉴 =======");
            System.out.println("1. 검색 조건이 있는 경우 메뉴 코드로 조회, 단, 없으면 전체 조회");
            System.out.println("2. 메뉴 혹은 카테고리로 검색. 단, 메뉴와 카테고리 둘 다 일치하는 경우도 검색하며, 검색 조건이 없는 경우 전체 조회");
            System.out.println("3. 원하는 메뉴 정보만 수정하기");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 번호를 입력해 주세요: ");
            int no = Integer.parseInt(br.readLine());
            switch (no) {
                case 1:
                    ms.searchMenuByCodeOrSearchAll(inputAllOrOne());
                    break;
                case 2:
                    ms.searchMenuByNameOrCategory(inputSearchCriteriaMap());
                    break;
                case 3:
                    ms.modifyMenu(inputChangeInfo());
                    break;
                case 9:
                    System.out.println("이전 메뉴로 돌아갑니다");
                    return;
            }
        } while (true);
    }

    private static Map<String, Object> inputChangeInfo() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("변경할 메뉴 코드를 입력하세요: ");
        int menuCode = Integer.parseInt(br.readLine());
        System.out.print("변경할 메뉴 이름을 입력하세요");
        String menuName = br.readLine();
        System.out.print("판매 여부를 결정해 주세요(Y/N): ");
        String orderableStatus = br.readLine().toUpperCase();
        Map<String, Object> criteria = new HashMap<>();
        criteria.put("menuCode", menuCode);
        criteria.put("menuName", menuName);
        criteria.put("orderableStatus", orderableStatus);
        return criteria;
    }

    private static Map<String, Object> inputSearchCriteriaMap() throws IOException {
        Map<String, Object> criteria = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("검색 조건을 입력하세요(category / name / both / none): ");
        String condition = br.readLine();

        if ("category".equals(condition)) {
            System.out.print("검색할 카테고리의 코드를 입력하세요: ");
            int categoryCode = Integer.parseInt(br.readLine());
            criteria.put("categoryCode", categoryCode);
        } else if ("name".equals(condition)) {
            System.out.print("검색할 이름을 입력하세요: ");
            String name = br.readLine();
            criteria.put("name", name);
        } else if ("both".equals(condition)) {
            System.out.print("검색할 카테고리의 코드를 입력하세요: ");
            int categoryCode = Integer.parseInt(br.readLine());
            criteria.put("categoryCode", categoryCode);
            System.out.print("검색할 이름을 입력하세요: ");
            String name = br.readLine();
            criteria.put("name", name);
        }
        return criteria;
    }

    private static SearchCriteria inputAllOrOne() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("검색 조건을 입력하시겠습니까?(y/n): ");
        boolean hasSearchValue = "y".equals(br.readLine());
        SearchCriteria searchCriteria = new SearchCriteria();
        if (hasSearchValue) {
            System.out.print("검색할 메뉴 코드를 입력하세요: ");
            String menuCode = br.readLine();
            searchCriteria.setCondition("menuCode");
            searchCriteria.setValue(menuCode);
        } else {
            searchCriteria.setCondition(null);
            searchCriteria.setValue(null);
        }
        return searchCriteria;
    }

    private static void forEachSubMenu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MenuService ms = new MenuService();
        do {
            System.out.println("======= forEach 서브 메뉴 =======");
            System.out.println("1. 랜덤한 메뉴 5개 추출해서 조회하기");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 번호를 입력해 주세요: ");
            int no = Integer.parseInt(br.readLine());
            switch (no) {
                case 1:
                    ms.searchMenuByRandomMenuCode(generageRandomMenuCodeList());
                    break;
                case 9:
                    System.out.println("이전 메뉴로 돌아갑니다");
                    return;
            }
        } while (true);
    }

    /* 설명: 중복되지 않은 21개의 메뉴 5개를 랜덤하게 생성하고 정렬 후 List<Integer>로 반환하는 메서드*/
    private static List<Integer> generageRandomMenuCodeList() {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 5) {
            int random = (int) (Math.random() * 21) + 1;
            set.add(random);
        }
        /* 설명: HashSet -> ArrayList*/
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println("생성된 랜덤 수: " + list);
        return list;
    }

    private static void chooseSubMenu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MenuService ms = new MenuService();
        do {
            System.out.println("======= choose 서브 메뉴 =======");
            System.out.println("1. 카테고리 상위 분류별 메뉴 보여주기");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 번호를 입력해 주세요: ");
            int no = Integer.parseInt(br.readLine());
            switch (no) {
                case 1:
                    ms.searchMenuBySupCategory(inputSupCategory());
                    break;
                case 9:
                    System.out.println("이전 메뉴로 돌아갑니다");
                    return;
            }
        } while (true);
    }

    private static SearchCriteria inputSupCategory() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("상위 분류를 입력해 주세요(식사, 음료, 디저트): ");
        String value = br.readLine();
        return new SearchCriteria("category", value);
    }

    private static void ifSubMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        MenuService ms = new MenuService();
        do {
            System.out.println("======= if 서브 메뉴 =======");
            System.out.println("1. 원하는 금액대에 적합한 추천 메뉴 목록 보여주기");
            System.out.println("2. 메뉴 이름 혹은 카테고리명으로 검색하여 메뉴 목록 보여주기");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 번호를 입력해 주세요: ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    ms.findMenuByPrice(inputPrice());
                    break;
                case 2:
                    ms.searchMenu(inputSearchCriteria());
                    break;
                case 9:
                    return;
            }
        } while (true);
    }

    private static SearchCriteria inputSearchCriteria() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("검색 기준을 입력해 주세요(name or category): ");
        String condition = br.readLine();
        System.out.print("검색어를 입력해주세요: ");
        String value = br.readLine();
        return new SearchCriteria(condition, value);
    }

    private static int inputPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색 할 가격대의 최대 금액을 입력해 주세요: ");
        return sc.nextInt();
    }
}
