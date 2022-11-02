package persons;

import stuff.Actions;
import stuff.Mineral;
import stuff.ShortiesType;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Shorties {
    protected ShortiesType type;
    protected String name;
    protected ArrayList<Actions> acts;
    protected boolean isFlying;
    protected Mineral mineral;

    public Shorties(ShortiesType type, String name, ArrayList<Actions> acts) {
        this.type = type;
        this.name = name;
        this.acts = acts;
        this.isFlying = false;
    }

    public Shorties(ShortiesType type, String name, ArrayList<Actions> acts, boolean isFlying, Mineral mineral) {
        this.type = type;
        this.name = name;
        this.acts = acts;
        this.isFlying = isFlying;
        this.mineral = mineral;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Actions> getAct() {
        return acts;
    }

    public void addAction(Actions act) {
        this.acts.add(act);
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        this.isFlying = flying;
    }

    public Mineral getMineral() {
        return mineral;
    }

    public void setMineral(Mineral mineral) {
        this.mineral = mineral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shorties shorties = (Shorties) o;
        return type == shorties.type && Objects.equals(name, shorties.name) && Objects.equals(acts, shorties.acts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, acts);
    }

    @Override
    public String toString() {
        return "Shorties{" +
                "type: " + type +
                ", name: " + name  +
                ", acts: " + acts +
                '}';
    }

}
