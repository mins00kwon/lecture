package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pokemonServiceCollection")
public class PokemonServiceByList {

    /* 설명:
    *   같은 타입의 빈이 2개 이상일 경우
    *   List 또는 Map 형태의 컬렉션 형태로 주입 받을 수 있다
    * */
    /* 설명: 1. 같은 타입의 빈을 List 형태로 주입 받음*/
    private List<Pokemon> pokemonList;

    @Autowired
    public PokemonServiceByList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public void pokemonAttack() {
        for (Pokemon pokemon : pokemonList) {
            pokemon.attack();
        }
    }
}
