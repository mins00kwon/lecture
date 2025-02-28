package com.ohgiraffers.section02.annotation.subsection04.resource;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import jakarta.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

@Service("pokemonServiceResource")
public class PokemonService {

    /* 설명: @Primary보다 우선순위 높게 빈의 id(이름)으로 하나의 빈을 선정 */
    /*@Resource
    private Pokemon pokemon;

    public void pokemonAttack(){
        pokemon.attack();
    }*/

    @Resource
    private List<Pokemon> pokemonList;
    public void pokemonAttack() {pokemonList.forEach(Pokemon::attack);}

}
