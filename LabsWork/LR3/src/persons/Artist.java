package persons;

import interfaces.Awakable;
import stuff.Actions;
import stuff.Type;

import java.util.ArrayList;
import java.util.List;

public class Artist extends Shorties implements Awakable {
    public Artist(String name) {
        super(Type.PROTAGONIST, name, new ArrayList<>(List.of(Actions.DRAW)));
    }

    @Override
    public void doSmth(Actions atc) {
        System.out.println(getName() + " is drawing a landscape");
    }
}
