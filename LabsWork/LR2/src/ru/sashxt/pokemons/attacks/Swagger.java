package ru.sashxt.pokemons.attacks;

import ru.ifmo.se.pokemon.*;

/**
 * Raises the target's Attack by two stages and confuses the target.
 */
public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected String describe() {
        return "use Swagger";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (pokemon.getStat(Stat.ATTACK)+2<=6) {
            pokemon.addEffect(new Effect().stat(Stat.ATTACK, 2));
            pokemon.confuse();
        }
    }
}
