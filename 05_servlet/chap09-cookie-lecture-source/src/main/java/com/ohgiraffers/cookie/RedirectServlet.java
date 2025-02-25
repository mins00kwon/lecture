package com.ohgiraffers.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* 설명: 클라이언트의 브라우저에 있는 모든 쿠키값은 request header에 같이 실려 온다*/
        String firstName="";
        String lastName="";
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + " " + cookie.getValue());
            if("firstName".equals(cookie.getName())) {
                firstName = cookie.getValue();
            }else if("lastName".equals(cookie.getName())) {
                lastName = cookie.getValue();
            }
        }
        /*System.out.println("===== redirect 이후 servlet에서 =====");
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);*/

        StringBuilder sb=new StringBuilder();
        sb.append("<h3>당신의 이름은 ")
                .append(firstName)
                .append("<br>그리고 성은 ")
                .append(lastName)
                .append("</h3>");
        resp.setContentType("text/html;charset=utf-8");
        /*PrintWriter out = resp.getWriter();
        out.println(sb.toString());
        필기 위 두 줄을 아래 한 줄로 줄일 수 있음*/
        resp.getWriter().println(sb.toString());
        resp.getWriter().flush();
        resp.getWriter().close();


    }
}
