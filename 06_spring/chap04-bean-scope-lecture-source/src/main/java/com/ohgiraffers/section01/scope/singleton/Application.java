package com.ohgiraffers.section01.scope.singleton;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ContextConfiguration.class);
        String[] beanNames=context.getBeanDefinitionNames();
        for(String beanName:beanNames){
            System.out.println(beanName);
        }

        /* 설명: 붕어빵, 딸기우유, 지리산 암반수를 진열*/
        Product carpBread=context.getBean("carpBread", Bread.class);
        Product milk=context.getBean("milk", Beverage.class);
        Product water=context.getBean("water",Beverage.class);

        /* 설명: 첫 번쨰 손님이 입장해서 쇼핑카트를 꺼내 물건을 담는다*/
        ShoppingCart cart1=context.getBean("cart",ShoppingCart.class);
        cart1.addItem(carpBread);
        cart1.addItem(milk);
        cart1.getItems().forEach(System.out::println);
        System.out.println();
        System.out.println(cart1.getItems());// toString을 오버라이딩하면 forEach 안써도 됨.
        
        /* 설명: 두 번째 손님이 입장해서 쇼핑카트를 꺼내 물건을 담는다*/

        ShoppingCart cart2=context.getBean("cart",ShoppingCart.class);
        System.out.println("cart2 = " + cart2);

        /* 설명: 빈은 기본적으로 Singleton 임*/
        System.out.println("cart1==cart2 ? : " + (cart1==cart2));
        cart2.addItem(water);
        cart2.getItems().forEach(System.out::println);
    }
}
