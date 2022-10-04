package persons;

import interfaces.Awakable;
import stuff.Actions;
import stuff.Type;

import java.util.Locale;

public class Child extends Shorties implements Awakable {

    public Child(Type type, String name, Actions act) {
        super(type, name, act);
    }

    @Override
    public void doSmth(Actions atc) {
        System.out.println(getName() + " " + getAct().toString().toLowerCase(Locale.ROOT) + "s");
    }

    @Override
    public String toString() {
        return "Child{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", act=" + act +
                '}';
    }
}
