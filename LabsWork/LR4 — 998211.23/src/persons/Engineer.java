package persons;

import interfaces.Awakable;
import stuff.Actions;
import stuff.ShortiesType;

import java.util.ArrayList;
import java.util.List;

public class Engineer extends Shorties implements Awakable {
    public Engineer(String name) {
        super(ShortiesType.EARTH, name, new ArrayList<>(List.of(Actions.BUILD)));
    }

    @Override
    public void doSmth() {
        System.out.println(name + " is designing a new home");
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", acts=" + acts +
                ", isFlying=" + isFlying +
                '}';
    }
}
