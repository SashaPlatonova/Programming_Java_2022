package ru.sashxt.pokemons.attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * Has a 30% chance to make the target flinch.
 */
public class Bite extends PhysicalMove {
    public Bite() {
        super(Type.DARK, 60, 100);
    }

    @Override
    protected String describe() {
        return "use Bite";
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        System.out.println("Расичтываем вероятность уклона");
        return (int) (Math.random() * 3) == 1;
    }
}
