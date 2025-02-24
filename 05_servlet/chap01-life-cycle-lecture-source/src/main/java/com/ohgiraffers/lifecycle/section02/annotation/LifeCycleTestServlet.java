package com.ohgiraffers.lifecycle.section02.annotation;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

public class LifeCycleTestServlet extends HttpServlet {
    @WebServlet(value="/annotation-lifecycle")
    public class LifecycleTestServlet extends HttpServlet {
        public LifecycleTestServlet() {
        }

        @Override
        public void init(ServletConfig config) throws ServletException {
            System.out.println("annotation 매핑 init() 메소드 호출");
        }

        @Override
        public void destroy() {
            System.out.println("annotation 매핑 destroy() 메소드 호출");
        }

        @Override
        public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
            System.out.println("annotation 매핑 service() 메소드 호출");
        }
    }
}
