package persons;

import interfaces.Awakable;
import stuff.Actions;
import stuff.Type;

public class Artist extends Shorties implements Awakable {
    public Artist(String name) {
        super(Type.PROTAGONIST, name, Actions.DRAW);
    }

    @Override
    public void doSmth(Actions atc) {
        System.out.println(getName() + " is drawing a landscape");
    }
}
