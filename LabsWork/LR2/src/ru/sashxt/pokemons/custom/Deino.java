package ru.sashxt.pokemons.custom;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.sashxt.pokemons.attacks.Bite;
import ru.sashxt.pokemons.attacks.Headbutt;

public class Deino extends Pokemon {


    public Deino(String name) {
        super(name, 20);
        this.setType(Type.DRAGON, Type.DARK);
        this.setStats(52, 65, 50, 45, 50, 38);
        this.setMove(new Bite(), new Headbutt());
    }
}
