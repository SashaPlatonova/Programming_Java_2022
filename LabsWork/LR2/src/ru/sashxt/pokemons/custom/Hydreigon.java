package ru.sashxt.pokemons.custom;

import ru.sashxt.pokemons.attacks.Slam;

public class Hydreigon extends Zweilous{
    public Hydreigon(String name) {
        super(name);
        this.setLevel(28);
        this.setStats(92, 105, 90, 125, 90, 98);
        this.addMove(new Slam());
    }
}
