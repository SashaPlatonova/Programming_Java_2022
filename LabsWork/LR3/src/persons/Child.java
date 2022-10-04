package persons;

import interfaces.Awakable;
import stuff.Actions;
import stuff.Type;

import java.util.ArrayList;
import java.util.Locale;

public class Child extends Shorties implements Awakable {

    public Child(Type type, String name, ArrayList<Actions> acts) {
        super(type, name, acts);
    }

    @Override
    public void doSmth(Actions act) {
        System.out.println(getName() + " " + act.toString().toLowerCase(Locale.ROOT) + "s");
    }

    @Override
    public String toString() {
        return "Child{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", acts=" + acts +
                '}';
    }
}
