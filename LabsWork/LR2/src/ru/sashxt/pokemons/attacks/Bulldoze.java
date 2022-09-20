package ru.sashxt.pokemons.attacks;

import ru.ifmo.se.pokemon.*;

/**
 * Has a 100% chance to lower the target's Speed by one stage
 */
public class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        super(Type.GROUND, 60, 100);
    }

    @Override
    protected String describe() {
        return "use Bulldoze";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(1).turns(-1).stat(Stat.SPEED, -1));
    }
}
