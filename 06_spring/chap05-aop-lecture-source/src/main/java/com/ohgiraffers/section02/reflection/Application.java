package com.ohgiraffers.section02.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Application {
    public static void main(String[] args)
            throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /* 설명: 리플렉션(reflection) 이란?
        *   컴파일 된 자바 코드에서 역으로 클래스를 불러 메소드 및 필드 정보를 구해오는 방법이다
        *   스프링 프레임워크, 마이바티스, 하이버네이트, jackson 등의 라이브러리에서 사용된다.
        *   (아직은 모르지만 쩄든 고급 기술들임ㅇㅇ)
        *   스프링에서는 런타임 시 개발자가 등록한 빈을 애플리케이션 내에서 사용할 수 있게 하는 기술이기도 하다.
        * */

        /* 설명: 1. Class 타입의 Class 메타정보 추출*/
        /* 필기: Class 라는 타입이 있음. 그래서 내가 만든 클래스의 타입 정보만 빼서 관리 가능 */
        Class class1=Application.class;
        System.out.println("class1 = " + class1);

        Class class2=new Account().getClass();
        System.out.println("class2 = " + class2);

        Class class3=Class.forName("com.ohgiraffers.section02.reflection.Account");
        System.out.println("class3 = " + class3);

        Class class4=Class.forName("[D");
        System.out.println("class4 = " + class4);

        Class class5=double[].class;
        System.out.println("class5 = " + class5);

        Class class6=Class.forName("[Ljava.lang.String;");
        System.out.println("class6 = " + class6);

        Class class7=String[].class;
        System.out.println("class7 = " + class7);

        /* 설명: 2. 필드 정보 추출*/
        Field[] fields=Account.class.getDeclaredFields();
        for (Field field:fields) {
            System.out.println("modifiers = " + Modifier.toString(field.getModifiers())
                                + ", name = " + field.getName()
                                + ", type = " + field.getType());
        }

        /* 설명: 3. 생성자 정보 추출*/
        Constructor[] constructors=Account.class.getDeclaredConstructors();
        for(Constructor constructor:constructors){
            System.out.println("name = " + constructor.getName());
            Class[] params=constructor.getParameterTypes();
            for(Class param:params){
                System.out.println("type = " + param.getTypeName());
            }
        }
        Account acc=(Account) constructors[0]
                .newInstance("20","3333-04-0875514","1234",10000);
        System.out.println(acc);

        /* 설명: 4. 메소드 정보 추출*/
        Method[] methods=Account.class.getMethods();
        Method getBalanceMethod=null;
        for(Method method:methods){
            System.out.println(Modifier.toString(method.getModifiers())+" "
                    +method.getName()+" "
                    +method.getReturnType().getSimpleName());
            if("getBalance".equals(method.getName())){
                getBalanceMethod=method;
            }
        }
        System.out.println("++++++");
        getBalanceMethod.invoke(acc);
    }
}
