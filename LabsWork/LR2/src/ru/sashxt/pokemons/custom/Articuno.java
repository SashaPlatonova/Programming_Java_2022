package ru.sashxt.pokemons.custom;

import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.sashxt.pokemons.attacks.AerialAce;
import ru.sashxt.pokemons.attacks.AncientPower;
import ru.sashxt.pokemons.attacks.DoubleTeam;
import ru.sashxt.pokemons.attacks.Facade;

import java.util.ArrayList;

public class Articuno extends Pokemon {
    public Articuno(String name) {
        super(name, 25);
        this.setStats(90, 85, 100, 95, 125, 85);
        this.setType(Type.FLYING, Type.ICE);
        this.setMove(new AerialAce(), new Facade(), new DoubleTeam(), new AncientPower());
    }
}
