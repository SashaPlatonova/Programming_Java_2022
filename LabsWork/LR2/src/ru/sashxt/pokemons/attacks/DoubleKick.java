package ru.sashxt.pokemons.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * Hits twice in one turn.
 */
public class DoubleKick extends PhysicalMove {
    public DoubleKick() {
        super(Type.FIGHTING, 30, 100);
    }

    @Override
    protected String describe() {
        return "use DoubleKick";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        for (int i = 0; i < 2; i++) {
            super.applyOppDamage(pokemon, v);
        }

    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        for (int i = 0; i < 2; i++) {
            super.applySelfDamage(pokemon, v);
        }
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        for (int i = 0; i < 2; i++) {
            super.applyOppEffects(pokemon);
        }
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        for (int i = 0; i < 2; i++) {
            super.applySelfEffects(pokemon);
        }
    }
}
