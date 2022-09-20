package ru.sashxt.pokemons.attacks;

import ru.ifmo.se.pokemon.*;

/**
 * Has a 10% chance to raise all of the user's stats by one stage.
 */
public class AncientPower extends SpecialMove {
    public AncientPower() {
        super(Type.ROCK, 60, 100);
    }

    @Override
    protected String describe() {
        return "use AncientPower";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.1).stat(Stat.HP, 1).stat(Stat.ATTACK, 1).stat(Stat.DEFENSE, 1)
        .stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1).stat(Stat.SPEED,1));
    }
}
