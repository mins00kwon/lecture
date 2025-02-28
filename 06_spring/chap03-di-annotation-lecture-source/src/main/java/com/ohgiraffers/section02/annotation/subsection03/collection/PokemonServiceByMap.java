package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pokemonServiceMap")
public class PokemonServiceByMap {
    private Map<String,Pokemon> pokemonMap;

    @Autowired
    public PokemonServiceByMap(Map<String, Pokemon> pokemonMap) {
        this.pokemonMap = pokemonMap;
    }

    public void pokemonAttack() {
        pokemonMap.forEach( (k,v)->{
            System.out.println("key: "+k+" value: "+v);
            v.attack();
            System.out.println();
        });
    }
}
