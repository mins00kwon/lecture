package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQualifier")
public class PokemonService {

    /* 설명: bean에 @Primary 가 설정되어 있더라도 주입을 받는 시점에 원하는 bean을 고를 수 있다*/
    /*@Autowired
    @Qualifier("squirtle")*/
    private Pokemon pokemon;


    @Autowired /* 설명: 생성자 주입은 파라미터 안에 Qualifier 어노테이션을 사용해야 함*/
    public PokemonService(@Qualifier("squirtle") Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}
