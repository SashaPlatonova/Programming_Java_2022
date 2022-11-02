package persons;

import interfaces.Awakable;
import stuff.Actions;
import stuff.ShortiesType;

import java.util.ArrayList;
import java.util.Locale;

public class Child extends Shorties implements Awakable {

    public Child(ShortiesType type, String name, ArrayList<Actions> acts) {
        super(type, name, acts);
    }

    @Override
    public void doSmth() {
        System.out.println(getName() + " " + this.getAct().get((int) (Math.random()*this.getAct().size()))
                .toString().toLowerCase(Locale.ROOT) + "s");
    }

    @Override
    public String toString() {
        return "Child{" +
                ", name='" + name + '\'' +
                ", acts=" + acts +
                '}';
    }

}
