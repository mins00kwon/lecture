package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class PrintResult {

    public void printMenus(List<MenuDTO> menuList) {
        menuList.forEach(System.out::println);
        System.out.println("조회 완료");
    }

    public void printErrorMessage(String message) {
        System.out.println("Error message: "+message);
    }

    public void printMenu(MenuDTO menu) {
        System.out.println("menu = " + menu);
    }
}
