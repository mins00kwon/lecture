package com.ohgiraffers.section02.headers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

@WebServlet("/header")
public class ResponseHeaderPrintServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();  // 길을 열어줌
        long currentTime = System.currentTimeMillis();  // 현재 서버의 시간
        /* 필기: ReponseTestSertvlet에서 적었던
        *   head니 html이니 그런거 생략해도 되기는 함 */
        writer.println("<h1>"+currentTime+"</h1>");
        writer.println("<h1>"+new java.util.Date(currentTime)+"</h1>");
        writer.flush();
        writer.close();

        /* 필기: 개발자 도구에서 봤던
        *   '헤더에 뭐가 있는지' 를
        *   아래 코드로 서버에서도 확인 가능함 */
        /* 설명: response 객체의 header 값에 대한 키-밸류 확인하기
        *   (개발자 도구에서도 확인 가능) */
        Collection<String> responseHeaders=resp.getHeaderNames();
        Iterator<String> iterator = responseHeaders.iterator();
        while (iterator.hasNext()) {
            String headerName = iterator.next();
            System.out.println(headerName+": "+resp.getHeader(headerName));
        }
    }
}
