package ru.sashxt.pokemons;

import ru.ifmo.se.pokemon.Battle;
import ru.sashxt.pokemons.custom.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Articuno("Monti"));
        b.addAlly(new Deino("Lagos"));
        b.addAlly(new Zweilous("Enzo"));

        b.addFoe(new Hydreigon("Beausoleil"));
        b.addFoe(new Tyrogue("Flater"));
        b.addFoe(new Hitmonlee("Demetrio"));
        b.go();
    }
}
