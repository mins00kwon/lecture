package com.ohgiraffers.section04.dto;

public class Application {
    public static void main(String[] args) {
        UserDTO user = new UserDTO();
        System.out.println(user.toString());
        System.out.println(user); //toString이 있으므로 .toString을 안붙였어도 붙은것 처럼 작동함
    }


}
