import design.Cave;
import exception.AllShortiesFlyException;
import interfaces.Awakable;
import persons.*;
import stuff.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Moon moon = new Moon();
        moon.setShorties(initializePersons());
        //startDoctorNap(moon.getShorties());

        ZeroGravityDevice device = new ZeroGravityDevice(new Luny(5, 80));
        ZeroGravityDevice.Engine engine = device. new Engine(100, 1);
        device.setOnMode(false);
        testDevice(moon.getShorties(), engine);

        Cave cave = new Cave();
        Mineral granite = new Mineral(new ArrayList<>(List.of("Серый")), false, true, false,
                10, 300, true) {
            @Override
            public void changeWeight(Shorties shorties) {
                if (shorties.getMineral() instanceof AntiLuny) {
                    shorties.setFlying(false);
                }
            }
        };
        cave.setMineral(granite);
        Cave.setPanels(initPanels(cave));
        Cave.setRooms(initRooms(cave));

        Cave.ControlCentre controlCentre = new Cave.ControlCentre();
        System.out.println("Затрачиваемая можность на одну комнату: " + controlCentre.calculatePower(10));
    }

    public static ArrayList<Shorties> initializePersons() {
        ArrayList<Shorties> shorties = new ArrayList<>();
        Doctor doctor = new Doctor("Pilulkin");
        Artist artist = new Artist("Tubik");
        doctor.setTimeOfSleep(8);
        doctor.setSleepType(SleepType.CAREFUL);

        shorties.add(doctor);
        shorties.add(artist);
        shorties.add(new Child(ShortiesType.EARTH, "Guslya", new ArrayList<>(List.of(Actions.PLAY_MUSIC))));
        ArrayList<String> names = new ArrayList<>(List.of("Vintic", "Shpuntic", "Kubic", "Klepka", "Fucsia", "Seledochkin"));
        for (int i = 0; i < names.size(); i++) {
            shorties.add(new Engineer(names.get(i)));
        }
        Shorties znaika = new Child(ShortiesType.EARTH, "Znaika",
                new ArrayList<>(List.of(Actions.OBSERVE, Actions.BUILD, Actions.STUDY)));
        znaika.setMineral(new AntiLuny(10, 100));
        Astrologer zvezdochkin = new Astrologer("Zvezdochkin");
        zvezdochkin.setMineral(new AntiLuny(10, 100));
        shorties.add(zvezdochkin);
        shorties.add(znaika);
        return shorties;
    }

    public static void startDoctorNap(ArrayList<Shorties> shorties) {
        Doctor doctor = null;
        for (Shorties shorty : shorties) {
            if (shorty instanceof Doctor) {
                doctor = (Doctor) shorty;
                break;
            }
        }
        if (doctor == null) {
            return;
        }
        doctor.snore(Level.LOUDLY);
        for (Shorties shorty : shorties) {
            if (shorty instanceof Awakable) {
                ((Awakable) shorty).doSmth();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void testDevice(ArrayList<Shorties> shorties, ZeroGravityDevice.Engine engine) {
        int flyingCounter = 0;
        for (Shorties shorty : shorties) {
            engine.work(shorty);
            if (shorty.isFlying()) {
                flyingCounter++;
            }
            if (flyingCounter == shorties.size()) {
                throw new AllShortiesFlyException("Все коротышки в воздухе, некому выключить устроуство для невесомости");
            }
        }
    }

    public static ArrayList<Cave.Room> initRooms(Cave cave) {
        ArrayList<Cave.Room> rooms = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rooms.add(cave. new Room(i, (float) Math.random()*100, (int) (Math.random() * 5)));
        }
        return rooms;
    }

    public static ArrayList<Cave.SolarPanel> initPanels(Cave cave) {
        ArrayList<Cave.SolarPanel> panels = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            panels.add(cave. new SolarPanel((int) (Math.random() * 1000), (float) Math.random()*10,
                    (int) (Math.random() * 10)));
        }
        return panels;
    }
}
