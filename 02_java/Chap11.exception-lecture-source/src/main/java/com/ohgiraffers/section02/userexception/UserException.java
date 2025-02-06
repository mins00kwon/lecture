package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class UserException {
    public static void main(String[] args) {
        /* 목표: 사용자 정의형 예외 클래스 정의 후 발생한 사용자 예외들을 처리할 수 있다*/
        ExceptionTest et = new ExceptionTest();
        try {
//            et.checkEnoughMoney(30000, 4000000);
//            et.checkEnoughMoney(-30000,29999);
//            et.checkEnoughMoney(30000,-29999);
            et.checkEnoughMoney(312421400,29999);
        }
        /* 설명: catch 블럭은 이어서 여러개를 쓸 수 있다
                여러개를 쓰는 이유: 각 예외를 다르게 처리하고자.
        *   try 블럭에서 예외가 발생하면 catch 블럭들은 순차적으로 실행되며
        *   이 때 부모 예외 클래스가 먼적 작성되어있으면 이후 catch 블럭들은 실행되지 않으므로
        *   자식 예외클래스의 catch 구문을 먼저 작성해야 한다*/
        catch (PriceNegativeException e){
            System.out.println(e.getMessage());
        }catch (MoneyNegativeException e){
            System.out.println(e.getMessage());
        }catch (NotEnoughMoneyException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램을 종료합니다");
    }
}
