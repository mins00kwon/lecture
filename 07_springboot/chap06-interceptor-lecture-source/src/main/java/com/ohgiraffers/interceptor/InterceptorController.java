package com.ohgiraffers.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InterceptorController {
    @GetMapping("stopwatch")
    public String handlerMethod(){
        System.out.println("핸들러 메소드 호출함...");

        return "result";
    }
}
