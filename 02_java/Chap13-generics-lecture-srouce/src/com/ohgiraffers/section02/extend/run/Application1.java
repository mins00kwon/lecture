package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.vo.Animal;
import com.ohgiraffers.section02.extend.vo.Bunny;
import com.ohgiraffers.section02.extend.vo.DrunkenBunny;
import com.ohgiraffers.section02.extend.vo.Mammal;
import com.ohgiraffers.section02.extend.vo.Rabbit;
import com.ohgiraffers.section02.extend.vo.RabbitFarm;
import com.ohgiraffers.section02.extend.vo.Snake;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: 제네릭 클래스를 좀 더 활용하는 예제를 이해할 수 있다*/
        /* 설명: 제네릭 클래스에서 extend 한 클래스의 상위 클래스나
             상속 관계가 전혀 없는 클래스를
             제네렉 타입으로 사용할 수 없다
             */
        /*RabbitFarm<Mammal> farm=new RabbitFarm<Mammal>();
        RabbitFarm<Snake> farm=new RabbitFarm<Snake>();
        RabbitFarm<Animal> farm1=new RabbitFarm<Animal>();*/

        /* 설명: <T extends Rabbit>에 의해 Rabbit 및 하위 타입으로만 제네릭 타입 객체 생성 가능*/
        /* 설명: 제네릭 타입으로 원하는 타입으로 쓸 수 있도록 설정하는 시점은 객체를 만드는 시점
        *   제네릭 타입으로 변경할 수 있는 타입의 범위를 설정하는것 제네릭 타입의 <T extends Class>*/
        RabbitFarm<Rabbit> rabbitFarm = new RabbitFarm<>();
        RabbitFarm<Bunny> rabbitFarm1 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> rabbitFarm2 = new RabbitFarm<>();

        rabbitFarm.setRabbit(new Rabbit());             // Rabbit / Bunny / DrunkenBunny
        rabbitFarm.getRabbit().cry();
        rabbitFarm1.setRabbit(new Bunny());             // Bunny만 가능
        rabbitFarm1.getRabbit().cry();
        rabbitFarm2.setRabbit(new DrunkenBunny());      // DrunkenBunny만 가능
        rabbitFarm2.getRabbit().cry();
    }
}
