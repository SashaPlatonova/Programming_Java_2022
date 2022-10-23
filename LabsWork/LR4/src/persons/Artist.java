package persons;

import interfaces.Awakable;
import stuff.Actions;
import stuff.ShortiesType;

import java.util.ArrayList;
import java.util.List;

public class Artist extends Shorties implements Awakable {
    public Artist(String name) {
        super(ShortiesType.EARTH, name, new ArrayList<>(List.of(Actions.DRAW)));
    }

    @Override
    public void doSmth() {
        System.out.println(getName() + " is drawing a landscape");
    }

    @Override
    public String toString() {
        return "Artist{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", acts=" + acts +
                '}';
    }


}
