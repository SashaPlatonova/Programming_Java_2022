package stuff;

import interfaces.WeightControlable;

import java.util.ArrayList;

public abstract class Mineral implements WeightControlable {
    //Св-ва: лист цветов, прозрачность, теплопроводность, электропроводность, удельный вес, темп плавления, глубина обитания
    protected ArrayList<String> colours;
    protected boolean transparency;
    protected boolean transcalency;
    protected boolean elConductivity;
    protected int weight;
    protected int meltingTemp;
    protected boolean deep;

    public Mineral(ArrayList<String> colours, boolean transparency, boolean transcalency, boolean elConductivity,
                   int weight, int meltingTemp, boolean deep) {
        this.colours = colours;
        this.transparency = transparency;
        this.transcalency = transcalency;
        this.elConductivity = elConductivity;
        this.weight = weight;
        this.meltingTemp = meltingTemp;
        this.deep = deep;
    }

    public ArrayList<String> getColours() {
        return colours;
    }

    public void setColours(ArrayList<String> colours) {
        this.colours = colours;
    }

    public boolean isTransparency() {
        return transparency;
    }

    public void setTransparency(boolean transparency) {
        this.transparency = transparency;
    }

    public boolean isTranscalency() {
        return transcalency;
    }

    public void setTranscalency(boolean transcalency) {
        this.transcalency = transcalency;
    }

    public boolean isElConductivity() {
        return elConductivity;
    }

    public void setElConductivity(boolean elConductivity) {
        this.elConductivity = elConductivity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMeltingTemp() {
        return meltingTemp;
    }

    public void setMeltingTemp(int meltingTemp) {
        this.meltingTemp = meltingTemp;
    }

    public boolean isDeep() {
        return deep;
    }

    public void setDeep(boolean deep) {
        this.deep = deep;
    }

    @Override
    public String toString() {
        return "Mineral{" +
                "colours=" + colours +
                ", transparency=" + transparency +
                ", transcalency=" + transcalency +
                ", elConductivity=" + elConductivity +
                ", weight=" + weight +
                ", meltingTemp=" + meltingTemp +
                ", deep=" + deep +
                '}';
    }
}
