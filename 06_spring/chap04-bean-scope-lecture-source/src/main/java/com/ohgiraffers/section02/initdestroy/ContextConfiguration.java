package com.ohgiraffers.section02.initdestroy;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread(){
        return new Bread("붕어빵",1000,new java.util.Date());
    }
    @Bean
    public Product milk(){
        return new Beverage("딸기우유",1500,500);
    }
    @Bean
    public Product water(){
        return new Beverage("지리산암반수",3000,1500);
    }
    @Bean
    /* 설명: 여기서 보이지는 않지만 @Scope("singleton") 이 적용되어 있는 것*/
    /* 설명: Bean Scope를 수정하게 되면 bean 객체의 life cycle을 다른 주기로 설정 가능*/
    @Scope("prototype")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }

    /* 필기: 아래처럼 하면 시작과 끝에 자동으로 실행되는 메서드 지정 가능 */
    @Bean(initMethod = "openShop", destroyMethod = "closeShop")
    public Owner owner(){
        return new Owner();
    }
}
