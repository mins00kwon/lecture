package com.ohgiraffers.section02.delete;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteSessionDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        System.out.println("attribute 만료 전 firstName: "
                +session.getAttribute("firstName"));
        System.out.println("attribute 만료 전 lastName: "
                + session.getAttribute("lastName"));

        /* 설명: HttpSession 객체의 Attribute 갈등을 무효화*/
        session.invalidate();
        /* 설명: 로그아웃 용도로 많이 사용함*/

        System.out.println("attribute 만료 후 firstName: "
                +session.getAttribute("firstName"));
        System.out.println("attribute 만료 후 lastName: "
                + session.getAttribute("lastName"));
        /* 설명: session 이 모휴화되어 attribute 를 가져올 수 없게 된다
        *   가져오라고 하면 500 에러가 발생한다
        * */
    }
}
