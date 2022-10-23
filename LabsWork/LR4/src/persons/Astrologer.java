package persons;

import interfaces.Awakable;
import stuff.Actions;
import stuff.ShortiesType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Astrologer extends Shorties {
    private static HashMap<Telescope, ArrayList<String>> knowledgeDB = new HashMap<>();

    public Astrologer(String name) {
        super(ShortiesType.EARTH, name, new ArrayList<>(List.of(Actions.OBSERVE)));
    }

    public static class Telescope {
        private int diameter;
        private int focalLength;

        public Telescope(int diameter, int focalLength) {
            this.diameter = diameter;
            this.focalLength = focalLength;
        }

        public void addKnowledge(String knowledge) {
            if (knowledgeDB.containsKey(this)) {
                knowledgeDB.get(this).add(knowledge);
            }
            else {
                knowledgeDB.put(this, new ArrayList<>(List.of(knowledge)));
            }
        }

        public ArrayList<String> getKnowledgeByTelescope() {
           return knowledgeDB.get(this);
        }

        @Override
        public String toString() {
            return "Telescope:" +
                    " diameter=" + diameter +
                    ", focalLength=" + focalLength;
        }
    }

    public void observe(Telescope telescope) {
        for (int i = 0; i < 5; i++) {
            if (Math.random()>=0.5){
                telescope.addKnowledge("fact #" + i);
            }
        }
        System.out.println("During observing " + name + " discovered: " + telescope.getKnowledgeByTelescope().toString());
    }

    public static HashMap<Telescope, ArrayList<String>> getKnowledgeDB() {
        return knowledgeDB;
    }

    public static void setKnowledgeDB(HashMap<Telescope, ArrayList<String>> knowledgeDB) {
        Astrologer.knowledgeDB = knowledgeDB;
    }
}
