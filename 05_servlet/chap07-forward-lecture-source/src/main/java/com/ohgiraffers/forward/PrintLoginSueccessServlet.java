package com.ohgiraffers.forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/print")
public class PrintLoginSueccessServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===== 포워딩되어 서블릿에서 넘겨받은 request 객체에 담긴 값 확인 =====");
        String username = (String) req.getAttribute("userName");
        String userId=req.getParameter("userId");
        String password = req.getParameter("password");
        System.out.println("userId = " + userId);
        System.out.println("password = " + password);
        System.out.println("username = " + username);
        resp.setContentType("text/html;charset=UTF-8");
        StringBuilder sb=new StringBuilder();
        sb.append("<h3>")
                .append(username)
                .append("님 환영합니다").append("</h3>");
        PrintWriter out=resp.getWriter();
        out.println(sb.toString());
        out.flush();
        out.close();
    }
}
