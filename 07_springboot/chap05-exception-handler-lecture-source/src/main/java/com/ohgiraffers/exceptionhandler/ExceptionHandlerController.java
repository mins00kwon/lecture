package com.ohgiraffers.exceptionhandler;

import jdk.jshell.spi.ExecutionControl.UserException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class ExceptionHandlerController {
    @GetMapping("simple-null")
    public String simpleNullPointerExceptionTest() {
        if(true) throw new NullPointerException();
        return "/";
    }
    @GetMapping("simple-user")
    public String userExceptionTest() throws MemberRegistException {

        if(true) {
            throw new MemberRegistException("당신은 안돼요!");
        }
        return "/";
    }

    @GetMapping("annotation-null")
    public String nullPointerExceptionHandlerTest() {
        String str=null;
        str.charAt(0);

        return "/";
    }

    @ExceptionHandler(NullPointerException.class)
    public String nullPointerExceptionHandler() {
        System.out.println("이 Controller에서 NullPointer 예외 발생 시 여기 오는지 확인");
        return "error/nullPointer";
    }
    @GetMapping("annotation-user")
    public String userExceptionHandlerTest() throws MemberRegistException {
        if(true) {
            throw new MemberRegistException("응애!! 응애!!");
        }

        return "/";
    }

    @ExceptionHandler(MemberRegistException.class)
    public String userExceptionHandler() {
        System.out.println("이 Controller에서 UserException 예외 발생 시 여기 오는지 확인");
        return "error/default";
    }
}
