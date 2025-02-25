package com.ohgiraffers.section01.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder responseText=new StringBuilder();
        responseText.append("<!DOCTYPE html>\n")
                    .append("<html>\n")
                    .append("<head>\n")
                    .append("<?head>\n")
                    .append("<body>\n")
                    .append("<h1>servlet response</h1>\n")
                    .append("<h1>한글 입니다!</h1>\n")
                    .append("</body>\n")
                    .append("</html>\n");

        /* 설명: MIME 타입과 인코딩 설정을 해 주어야
        *   1. 단순 text가 아닌 html 문서로 인식하며
        *   2. 한글이 꺠지지 않고 출력된다.
        *  단, 톰캣 10버전 (jakarta) 부터는 자동으로 처리된다 */
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
//         필기: 위의 두 줄 코드를 한 줄로 줄이는 방법
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out=resp.getWriter();
        out.print(responseText);
        out.flush();
        out.close();
        // resp은 돌아갈 길을 알고 있음
        // 따라서 위 코드는 돌아가는 길을 만든 것
        // 얘도 stream 이니까 닫아줘야 함
    }
}
