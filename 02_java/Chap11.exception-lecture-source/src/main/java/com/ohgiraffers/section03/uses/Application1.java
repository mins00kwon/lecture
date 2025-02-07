package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 에외처리를 많이 사용하는 io패키지와 관련된 try-catch 구문을 이해할 수 있다*/
        /* 설명:
        *   예외처리를 가장 많이 사용하게 되는 상황(io 패키지 관련) 에서 try-catch 구문을 실제 상황과 유사하게 연습*/

        BufferedReader br = null;
        /* 설명: 프로젝트 바로 아래 경로에 test.dat 파일이 있다면 그걸 인지한 File 객체를 생성해 절대경로를 출력*/
        System.out.println(new File("test.dat").getAbsolutePath());
        try{
            br=new BufferedReader(new FileReader("test.dat"));
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }finally {
            /* 설명:
            *   예외처리 구문과 상관 없이 반드시 수행해야 하는 경우 finally에 작성하는데
            *   보통 사용한 자원(rsource)를 반납하는 용도로 사용하게 된다
            * */
            try{
                assert br != null;
                br.close();
                /* 설명: 입출력에서 사용한 스트림(통로)을 닫아주는 용도의 메소드
                *   스ㅡㅌ림이 없을 때(null)을 고려하고 IOException을 처리해야 제대로 쓸 수 있다.*/
            }catch (RuntimeException | IOException e){
                throw new RuntimeException(e);
            }
        }

    }
}
