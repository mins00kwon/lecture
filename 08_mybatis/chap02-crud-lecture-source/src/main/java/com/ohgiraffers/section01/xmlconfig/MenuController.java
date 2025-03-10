package com.ohgiraffers.section01.xmlconfig;

import java.util.List;
import java.util.Map;

public class MenuController {
    private final MenuService menuService;
    private final PrintResult printResult;

    public MenuController() {
        menuService = new MenuService();
        printResult=new PrintResult();
    }

    public void findAllMenus() {
        List<MenuDTO> menuList = menuService.findAllMenus();
        System.out.println("===== Controller에서 출력");
        menuList.forEach(System.out::println);
        if(!menuList.isEmpty()){    // 단순 조회이기 때문에 commit / rollback 처리 할 필없음
            printResult.printMenus(menuList);
        }else { // 조회 실패
            printResult.printErrorMessage("전체 메뉴 조회 실패");
        }
    }

    public void findMenuByMenuCode(Map<String, String> parameter) {
        int menuCode=Integer.parseInt(parameter.get("menuCode"));
        MenuDTO menu=menuService.findMenuByMenuCode(menuCode);
        if(menu!=null){
            printResult.printMenu(menu);
        }else{
            printResult.printErrorMessage(menuCode+"번 메뉴는 존재하지 않습니다");
        }
    }
}