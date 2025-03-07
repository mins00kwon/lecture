package com.ohgiraffers.interceptor;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.Locale;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/* 설명:
*   1. bean을 다룰 수 있다. (필터와의 차이점)
*   2. 핸들러 메소드 직전/직후에 동작하여 전후 처리를 한다
*       (forward 및 redirect 일지라도 매번 핸들러 메소드 실행 시 동작)
*   3. 이후에 진행될 핸들러 메소드의 동작 여부를 제어할 수 있다. (preHandle의 반환형을 통해)
*   4. 사용처: 로그인 체크, 권한 체크, 프로그램 실행 시간 계산 작업 로그 처리, 업로드 파일 사이즈 처리(리사이징), 로케일(지역) 설정 등*/
@Component
public class StopwatchInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("preHandle 호출함...(핸들러 메소드 이전)");
        long startTime = System.currentTimeMillis();
        /* 필기: 이러면 핸들러 메서드에도 리퀘스트로 전달됨
        *   중요: 리퀘스트 객체는 계속 유지된다. */
        request.setAttribute("startTime", startTime);

        /* 질문: 이게 뭐임?? 내가 세션에 대해 잘못 이해하고 있는건가
        *   세션이 없으면 어캄?
        *   답변: 없으면 만들어서 반환한다!!!*/
        /* 설명 requestHeader에서 지역 추출 후
        HttpSession session = request.getSession();
        session.getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);

        *//* 필기: Request 안에 담겨있는 값 안에 지역 정보가 담겨있나보지ㅇㅇ *//*
        Locale locale = (Locale) session.getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);

        if(locale == null) {
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.KOREA);
        }

        System.out.println("요청자의 국가: "+locale);*/

        return true;

        /* 설명: 핸들러 인터셉터는 bean을 활용할 수 있으며,
        *   이후 핸들러 메소드 동작 여부를 반환형으로 제어할 수 있다*/
//        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle 호출함...(핸들러 메소드 이후)");
        long endTime = System.currentTimeMillis();
        /* 필기: 여기까지도 request에 담겨서 옴*/
        /* 필기: getAttribute의 반환형은 Object이기 떄문에 long으로 다운캐스팅 해줘야 함 */
        long startTime = (long) request.getAttribute("startTime");
        /* 설명: postHandle의 ModelAndView는 Handler Method가 반환한 ModelAndView에 해당된다. */
        modelAndView.addObject("interval", endTime - startTime);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
