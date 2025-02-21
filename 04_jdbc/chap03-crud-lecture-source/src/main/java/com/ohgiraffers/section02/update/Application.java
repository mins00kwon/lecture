package com.ohgiraffers.section02.update;

import com.ohgiraffers.section01.insert.MenuService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("변경할 메뉴 번호를 입력하세요: ");
        int menuCode= Integer.parseInt(br.readLine());
        System.out.print("변경할 메뉴 이름을 입력하세요: ");
        String menuName= br.readLine();
        System.out.print("변경할 메뉴 가격을 입력하세요: ");
        int menuPrice= Integer.parseInt(br.readLine());

        Menu menu=new Menu(menuCode,menuName,menuPrice);
        MenuService service=new MenuService();
        service.modifyMenu(menu);
    }
}
