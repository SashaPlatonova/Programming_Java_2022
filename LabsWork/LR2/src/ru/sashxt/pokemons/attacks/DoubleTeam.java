package ru.sashxt.pokemons.attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

/**
 * Raises the user's evasion by one stage.
 */
public class DoubleTeam extends StatusMove {

    @Override
    protected String describe() {
        return "use DoubleTeam";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().turns(-1).stat(Stat.EVASION, 1));
    }
}
