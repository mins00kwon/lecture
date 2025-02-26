package com.ohgiraffers.section02.uses;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/member/*")
public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        if("POST".equals(httpRequest.getMethod())) {
            httpRequest.setCharacterEncoding("UTF-8");
        }
        /* 설명:
        *   톰캣 10버전 이전에는 post 요청일 때는 인코딩 설정을 하지 않으면 한글이 깨졌음
        *   현재 사용중인 버전은 10버전이라 굳이 안해줘도 되기는 함
        *   하지만 현업에서는 사용하는 버전에 따라 인코딩 필터를 사용해야 할 수 있음
        *   추가로 다른 인코딩 설정을 바꿀 때도 해당 방식으로 작동하는 필터를 구현해야 함
        * */
        /* 필기: 수정한 request 를 다음 필터 또는 서블릿으로 전송함 */
        filterChain.doFilter(httpRequest, servletResponse);
    }
}
