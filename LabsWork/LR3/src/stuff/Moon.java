package stuff;

import persons.Shorties;

import java.util.ArrayList;
import java.util.Objects;

public class Moon {
    ArrayList<Shorties> shorties;

    public Moon(ArrayList<Shorties> shorties) {
        this.shorties = shorties;
    }

    public Moon() {
    }

    public ArrayList<Shorties> getShorties() {
        return shorties;
    }

    public void setShorties(ArrayList<Shorties> shorties) {
        this.shorties = shorties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moon moon = (Moon) o;
        return Objects.equals(shorties, moon.shorties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shorties);
    }

    @Override
    public String toString() {
        return "Moon{" +
                "on the Moon now shorties: " + shorties +
                '}';
    }
}
