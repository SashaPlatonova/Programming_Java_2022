package design;

import stuff.Mineral;

import java.util.ArrayList;

public class Cave {

    private static ArrayList<Room> rooms;
    private static ArrayList<SolarPanel> panels;
    private Mineral mineral;

    public class Room {
        private int number;
        private float square;
        private int sleepPlace;

        public Room(int number, float square, int sleepPlace) {
            this.number = number;
            this.square = square;
            this.sleepPlace = sleepPlace;
        }
    }

    public class SolarPanel {
        private int power;
        private float square;
        private int lampNumber;

        public SolarPanel(int power, float square, int lampNumber) {
            this.power = power;
            this.square = square;
            this.lampNumber = lampNumber;
        }

        public float calcExpenses(int cost) {
            return power*square*cost;
        }

    }

    public static class ControlCentre{
        public float calculatePower(int hours) {
            int total = 0;
            for (SolarPanel panel : panels) {
                total += panel.lampNumber*50;
            }
            total *= hours;
            return (float) total / rooms.size();
        }
    }

    public static ArrayList<Room> getRooms() {
        return rooms;
    }

    public static void setRooms(ArrayList<Room> rooms) {
        Cave.rooms = rooms;
    }

    public static ArrayList<SolarPanel> getPanels() {
        return panels;
    }

    public static void setPanels(ArrayList<SolarPanel> panels) {
        Cave.panels = panels;
    }

    public Mineral getMineral() {
        return mineral;
    }

    public void setMineral(Mineral mineral) {
        this.mineral = mineral;
    }
}
