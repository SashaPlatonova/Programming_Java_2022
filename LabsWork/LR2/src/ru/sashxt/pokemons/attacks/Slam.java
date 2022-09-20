package ru.sashxt.pokemons.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Inflicts regular damage with no additional effect.
 */
public class Slam extends PhysicalMove {
    public Slam() {
        super(Type.NORMAL, 80, 75);
    }

    @Override
    protected String describe() {
        return "use Slam";
    }
}
