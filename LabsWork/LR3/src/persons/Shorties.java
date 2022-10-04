package persons;

import stuff.Actions;
import stuff.Type;

import java.util.Objects;

public abstract class Shorties {
    protected Type type;
    protected String name;
    protected Actions act;

    public Shorties(Type type, String name, Actions act) {
        this.type = type;
        this.name = name;
        this.act = act;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actions getAct() {
        return act;
    }

    public void setAct(Actions act) {
        this.act = act;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shorties shorties = (Shorties) o;
        return type == shorties.type && Objects.equals(name, shorties.name) && act == shorties.act;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, act);
    }
}
