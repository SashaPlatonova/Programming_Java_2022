package persons;

import interfaces.Snoreble;
import stuff.Actions;
import stuff.Level;
import stuff.SleepType;
import stuff.Type;

import java.util.ArrayList;
import java.util.Objects;

public class Doctor extends Shorties implements Snoreble {
    private int timeOfSleep;
    private SleepType sleepType;
    private boolean isAwake;
    private int awakeCounter;

    public Doctor(String name) {
        super(Type.PROTAGONIST, name, new ArrayList<>());
        this.isAwake = true;
    }

    @Override
    public void snore(Level level) {
        System.out.println(getName()+" start nap " + level);
        Runnable awake = () -> {
            for (int i = 0; i < getTimeOfSleep(); i++) {
                float n = (float) Math.random();
                if (n<0.5) {
                    setAwakeCounter(getAwakeCounter()+1);
                    System.out.println(getName() + " is awake");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(getName() + " was awake " + getAwakeCounter() + " times");
        };

        Runnable sleep = () -> {
            try {
                Thread.sleep(getTimeOfSleep()* 1000L);
                System.out.println(getName() + " awake " + getAwakeCounter() + " times");
                System.out.println(getName()+" ended nap");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        if (getSleepType()==SleepType.CAREFUL) {
            new Thread(awake).start();
        }
        else {
            new Thread(sleep).start();
        }
    }

    public int getTimeOfSleep() {
        return timeOfSleep;
    }

    public void setTimeOfSleep(int timeOfSleep) {
        this.timeOfSleep = timeOfSleep;
    }

    public boolean isAwake() {
        return isAwake;
    }

    public void setAwake(boolean awake) {
        isAwake = awake;
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
