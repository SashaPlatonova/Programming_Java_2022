package persons;

import interfaces.Awakable;
import stuff.Actions;
import stuff.ShortiesType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Astrologer extends Shorties implements Awakable{

    public Astrologer(String name) {
        super(ShortiesType.EARTH, name, new ArrayList<>(List.of(Actions.OBSERVE)));
    }


    @Override
    public void doSmth() {
        System.out.println(this.getName() + " is observing");
    }
}
