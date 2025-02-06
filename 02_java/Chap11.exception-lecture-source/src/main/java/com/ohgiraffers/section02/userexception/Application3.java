package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application3 {
    public static void main(String[] args) {
        ExceptionTest2 et=new ExceptionTest2();
        try {
            et.checkEnoughMoney(312421400,29999);
        }
        /* 설명: Multi Catch 블럭
        *   두 개 이상의 예외를 | 를 사용해서 하나의 catch 블럭으로 처리할 수 있다.*/
        catch (PriceNegativeException | MoneyNegativeException e){
            System.out.println(e.getMessage());
        }catch (NotEnoughMoneyException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
