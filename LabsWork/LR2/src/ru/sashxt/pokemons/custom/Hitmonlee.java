package ru.sashxt.pokemons.custom;

import ru.sashxt.pokemons.attacks.DoubleKick;

public class Hitmonlee extends Tyrogue{
    public Hitmonlee(String name) {
        super(name);
        this.setStats(50, 120, 53, 35, 110, 87);
        this.addMove(new DoubleKick());
    }
}
