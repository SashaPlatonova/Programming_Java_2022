package ru.sashxt.pokemons.custom;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.sashxt.pokemons.attacks.Bulldoze;
import ru.sashxt.pokemons.attacks.Facade;
import ru.sashxt.pokemons.attacks.Swagger;

public class Tyrogue extends Pokemon {
    public Tyrogue(String name) {
        super(name, 87);
        this.setStats(35, 35, 35, 35,35, 35);
        this.setType(Type.FIGHTING);
        this.setMove(new Facade(), new Bulldoze(), new Swagger());
    }
}
