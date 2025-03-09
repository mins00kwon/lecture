package com.ohgiraffers.interceptor;

import org.springframework.stereotype.Service;

@Service
public class InterCeptorTestService {
    public void test(){
        System.out.println("서비스 bean 동작 확인");
    }
    public void test2(){
        System.out.println("ddfa");

    }
}
