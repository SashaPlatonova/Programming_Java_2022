package ru.sashxt.pokemons.custom;

import ru.sashxt.pokemons.attacks.DoubleHit;

public class Zweilous extends Deino {
    public Zweilous(String name) {
        super(name);
        this.setStats(72, 85, 70, 65, 70, 58);
        this.addMove(new DoubleHit());
    }
}
