package persons;

import stuff.Actions;
import stuff.Type;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Shorties {
    protected Type type;
    protected String name;
    protected ArrayList<Actions> acts;

    public Shorties(Type type, String name, ArrayList<Actions> acts) {
        this.type = type;
        this.name = name;
        this.acts = acts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Actions> getAct() {
        return acts;
    }

    public void addAction(Actions act) {
        this.acts.add(act);
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
