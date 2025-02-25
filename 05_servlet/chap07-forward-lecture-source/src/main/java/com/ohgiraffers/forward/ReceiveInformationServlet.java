package com.ohgiraffers.forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/forward")
public class ReceiveInformationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId=req.getParameter("userId");
        String password=req.getParameter("password");
        System.out.println("userId = " + userId);
        System.out.println("password = " + password);

        /* 설명:
        *   이 부분에서는 id와 pwd에 해당하는 user의 정보를 DB까지 가서 select하고
        *   일치하는지 확인하는 비즈니스 로직(BL)이 수행되어야 한다
        *   그 결과는 회원의 정보를 조회해 오고,
        *   아래에서는 제대로 조회되었다는 가정 하에 '000님 환영합니다.' 라는 메시지를 출력하는 화면을 만들어 응답한다*/

        /* 필기: attribute에 사용자 이름을 담는 이유
        *   여기서 페이지를 만들것이 아니라 화면을 잘 그려주는 서블릿에 위임하기 위함 */
        req.setAttribute("userName", "홍길동");
        RequestDispatcher rd=req.getRequestDispatcher("print"); // 여기는 / 안쓰네??
        rd.forward(req, resp);
    }
}
