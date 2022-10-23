import interfaces.Aggressive;
import interfaces.Awakable;
import persons.*;
import stuff.*;

import java.util.ArrayList;
import java.util.List;

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
            shorties.add(new Child(ShortiesType.EARTH, "Child-" + i, new ArrayList<>(List.of(a))));
        }
        shorties.add(doctor);
        shorties.add(artist);
        moon.setShorties(shorties);

       /* doctor.snore(Level.LOUDLY);
        for (Shorties shorty : moon.getShorties()) {
            if (shorty instanceof Awakable) {
                ((Awakable) shorty).doSmth();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
 */

        Police police = new Police("Police officer #1", WeaponType.CLUB);
        police.doSmth();

        Astrologer astrologer = new Astrologer("Steclyshka");
        Astrologer.Telescope telescope = new Astrologer.Telescope(120, 850);
        astrologer.observe(telescope);

    }
}
