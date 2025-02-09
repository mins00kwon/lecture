package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.vo.Bunny;
import com.ohgiraffers.section02.extend.vo.DrunkenBunny;
import com.ohgiraffers.section02.extend.vo.Rabbit;
import com.ohgiraffers.section02.extend.vo.RabbitFarm;
import com.ohgiraffers.section02.extend.vo.WildCardFarm;

public class Application2 {
    public static void main(String[] args) {
        WildCardFarm wildCardFarm = new WildCardFarm();

        Rabbit r=new Rabbit();
        RabbitFarm<Rabbit> rFarm=new RabbitFarm<>(r);
        wildCardFarm.anyType(rFarm);
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        wildCardFarm.extendType(new RabbitFarm<Bunny>(new Bunny()));

        // 상한이 걸려있으면 부모도 안되고 형제도 안됨
        /*wildCardFarm.extendType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extendType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));*/

        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));

        // 하한 제한이 걸려 있으면 부모는 가능하지만 형제는 여전히 안됨.
        /*wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));*/


    }
}
