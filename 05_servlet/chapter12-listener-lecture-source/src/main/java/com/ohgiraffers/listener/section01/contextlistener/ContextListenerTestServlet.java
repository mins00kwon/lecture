package com.ohgiraffers.listener.section01.contextlistener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/context")
public class ContextListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("context listener 확인용 서블릿");

        /* 필기:
        *   흐름임
        *   사물함임
        *   서블릿이 뒤지지 않는 이상 죽지 않음 */
        ServletContext context = req.getServletContext();

        context.setAttribute("test1", "value1");
        context.setAttribute("test2", "value2");
        context.setAttribute("test3", "value3");
        context.setAttribute("test4", "value3");
        context.setAttribute("test5", "value3");
        context.setAttribute("test6", "value3");


        context.setAttribute("test2", "replaced value2");

        context.removeAttribute("test3");

    }
}
