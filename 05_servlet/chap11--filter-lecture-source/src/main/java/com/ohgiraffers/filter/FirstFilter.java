package com.ohgiraffers.filter;


import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;
/* 설명: /first 이후 경로는 어떤 것이든 지금읨 FirstFilter 를 거치는 요청 경로가 된다*/
@WebFilter("/first/*")
public class FirstFilter implements Filter {
    public FirstFilter() {
        System.out.println("FirstFilter 인스턴스 생성");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FirstFilter 의 init 호출");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        System.out.println("FirstFilter 의 doFilter 호출!");

        /* 설명: FilterChain 에서 제공하는 doFilter는 다음 필터 또는 서블릿으로 진행하라는 의미이다*/
        filterChain.doFilter(servletRequest, servletResponse);      // 다음 필터로 넘기는 코드
                                                                    // 다음 필터가 없으면 서블릿으로 넘어감
        System.out.println("서블릿 다녀온 후");
    }

    @Override
    public void destroy() {
        System.out.println("FirstFilter 의 destroy 호출");

    }
}
