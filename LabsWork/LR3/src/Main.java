import interfaces.Awakable;
import persons.Artist;
import persons.Child;
import persons.Doctor;
import persons.Shorties;
import stuff.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Moon moon = new Moon();
        ArrayList<Shorties> shorties = new ArrayList<>();
        Doctor doctor = new Doctor("Pilulkin");
        Artist artist = new Artist("Tubik");
        doctor.setTimeOfSleep(8);
        doctor.setSleepType(SleepType.STRONG);

        for (int i = 0; i < 5; i++) {
            Actions a = Actions.values()[(int) (Math.random()*Actions.values().length)];
            shorties.add(new Child(Type.PROTAGONIST, "Child-" + i, a));
        }
        shorties.add(doctor);
        shorties.add(artist);

        doctor.snore(Level.LOUDLY);

        moon.setShorties(shorties);
        for (Shorties shorty : moon.getShorties()) {
            if (shorty instanceof Awakable) {
                ((Awakable) shorty).doSmth(shorty.getAct());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
