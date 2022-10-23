package persons;

import exception.DoctorIsAwakeException;
import interfaces.Snoreble;
import stuff.Actions;
import stuff.Level;
import stuff.SleepType;
import stuff.ShortiesType;

import java.util.ArrayList;
import java.util.Objects;

public class Doctor extends Shorties implements Snoreble {
    private int timeOfSleep;
    private SleepType sleepType;
    private boolean isAwake;
    private int awakeCounter;

    public Doctor(String name) {
        super(ShortiesType.EARTH, name, new ArrayList<Actions>());
        this.isAwake = true;
    }

    @Override
    public void snore(Level level) {
        System.out.println(getName()+" start nap " + level);
        this.isAwake = false;
        Runnable awake = () -> {
            for (int i = 0; i < getTimeOfSleep(); i++) {
                float n = (float) Math.random();
                if (n<0.5) {
                    setAwakeCounter(getAwakeCounter()+1);
                    try {
                        throw new DoctorIsAwakeException("Doctor " + this.name + " is awake");
                    } catch (DoctorIsAwakeException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(getName() + " was awake " + getAwakeCounter() + " times");
        };

        Runnable sleep = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(getTimeOfSleep()* 1000L);
                    System.out.println(getName() + " awake " + getAwakeCounter() + " times");
                    System.out.println(getName()+" ended nap");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        if (getSleepType()==SleepType.CAREFUL) {
            new Thread(awake).start();
        }
        else {
            new Thread(sleep).start();
        }
        this.isAwake = true;
    }

    public int getTimeOfSleep() {
        return timeOfSleep;
    }

    public void setTimeOfSleep(int timeOfSleep) {
        this.timeOfSleep = timeOfSleep;
    }

    public int getAwakeCounter() {
        return awakeCounter;
    }

    public void setAwakeCounter(int awakeCounter) {
        this.awakeCounter = awakeCounter;
    }

    public SleepType getSleepType() {
        return sleepType;
    }

    public void setSleepType(SleepType sleepType) {
        this.sleepType = sleepType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return timeOfSleep == doctor.timeOfSleep && isAwake == doctor.isAwake && awakeCounter == doctor.awakeCounter
                && sleepType == doctor.sleepType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeOfSleep, sleepType, isAwake, awakeCounter);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "timeOfSleep=" + timeOfSleep +
                ", sleepType=" + sleepType +
                ", isAwake=" + isAwake +
                ", awakeCounter=" + awakeCounter +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", acts=" + acts +
                '}';
    }
}
