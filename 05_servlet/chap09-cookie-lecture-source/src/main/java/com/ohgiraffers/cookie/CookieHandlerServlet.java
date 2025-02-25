package com.ohgiraffers.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie")
public class CookieHandlerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName=req.getParameter("firstName");
        String lastName=req.getParameter("lastName");

        System.out.println("성 = " + lastName);
        System.out.println("이름 = " + firstName);

        /* 설명:
        *   쿠키(클라이언트의 브라우저에 저장)를 생성해서 전달하는 방법
        *   1. 쿠키 인스턴스를 생성한다.
        *   2. 해당 쿠키의 만료시간을 설정한다.
        *   3. 응답 헤더에 쿠키를 담는다
        *   4. 응답한다
        * */
        Cookie firstNameCookie = new Cookie("firstName", firstName);
        Cookie lastNameCookie = new Cookie("lastName", lastName);

        firstNameCookie.setMaxAge(60*60*24);    // 초 단위로 생성. 이 코드처럼 하면 하루의 만료시간을 가짐
        lastNameCookie.setMaxAge(60*60*12);     // 12시간의 만료시간을 가짐

        resp.addCookie(firstNameCookie);
        resp.addCookie(lastNameCookie);

        resp.sendRedirect("redirect");
    }
}
