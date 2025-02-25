package com.ohgiraffers.redirect.section02.otherservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/otherservlet")
public class OtherServletRedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("test", "abc");
//        resp.sendRedirect("redirect");
        resp.sendRedirect("redirect?test=abc"); // attribtue는 안되지만 파라미터로는 어떻게 보낼 수 있기는 함
    }
}
