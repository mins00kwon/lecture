package com.ohgiraffers.section01.insert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 설명:
*   Service 계층과 Repository(DAO) 계층을 구분하고
*   XML 파일에서부터 쿼리를 불러와서 insert 해보기
* */
// DAO = Data Access Object
public class Application2 {
    /* 설명: view이자 controller의 개념( 입력 받은 데이터로 하나의 Menu 객체로 만들기) */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("메뉴의 이름을 입력하세요: ");
        String menuName= br.readLine();
        System.out.print("메뉴의 가격을 입력하세요: ");
        int menuPrice= Integer.parseInt(br.readLine());
        System.out.print("카테고리 코드를 입력하세요: ");
        int categoryCode= Integer.parseInt(br.readLine());
        System.out.print("판매 상태를 입력하세요(Y/N)");
        String orderableStatus= br.readLine().toUpperCase();

        Menu menu=new Menu(menuName,menuPrice,categoryCode,orderableStatus);

        MenuService service=new MenuService();
        service.registMenu(menu);
    }
}
