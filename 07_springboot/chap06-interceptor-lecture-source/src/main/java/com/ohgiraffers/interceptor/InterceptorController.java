package com.ohgiraffers.interceptor;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InterceptorController {
    @GetMapping("stopwatch")
    public String handlerMethod() throws InterruptedException {
        System.out.println("핸들러 메소드 호출함...");
        Thread.sleep((int) (Math.random() * 1000) + 1);
        return "result";
    }
}