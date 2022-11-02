package stuff;

import persons.Shorties;

import java.util.ArrayList;
import java.util.List;

public class Luny extends Mineral{

    public Luny(int weight, int meltingTemp) {
        super(new ArrayList<>(List.of("Желтый", "Зеленоватый")), false, true, false,
                weight, meltingTemp, true);
    }

    @Override
    public void changeWeight(Shorties shorties) {
        if (shorties.getMineral() instanceof AntiLuny) {
            if (shorties.getMineral().getWeight()>this.weight) {
                shorties.setFlying(false);
                System.out.println("У " + shorties.getName() + " достаточно антилуния");
                return;
            }
        }
        shorties.setFlying(true);
        System.out.println(shorties.getName() + " взлетел");
    }
}
