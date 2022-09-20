package ru.sashxt.pokemons.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

/**
 * Inflicts regular damage. If the user is burned, paralyzed, or poisoned, this move has double power.
 */
public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe() {
        return "use Facade";
    }

    @Override
    protected double calcBaseDamage(Pokemon pokemon, Pokemon pokemon1) {
        if (pokemon.getCondition().equals(Status.BURN) || pokemon.getCondition().equals(Status.PARALYZE) ||
                pokemon.getCondition().equals(Status.POISON)) {
            return (super.calcBaseDamage(pokemon, pokemon1))*2;
        } else {
            return super.calcBaseDamage(pokemon, pokemon1);
        }
    }
}
