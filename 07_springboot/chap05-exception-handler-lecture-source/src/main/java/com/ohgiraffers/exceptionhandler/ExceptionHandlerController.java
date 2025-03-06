package com.ohgiraffers.exceptionhandler;

import jdk.jshell.spi.ExecutionControl.UserException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
}
