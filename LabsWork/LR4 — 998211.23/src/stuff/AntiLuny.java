package stuff;

import persons.Shorties;

import java.util.ArrayList;
import java.util.List;

public class AntiLuny extends Mineral{

    public AntiLuny(int weight,
                    int meltingTemp) {
        super(new ArrayList<>(List.of("Фиолетовый", "Сиреневатый")), true, false, true,
                weight, meltingTemp, false);
    }

    @Override
    public void changeWeight(Shorties shorties) {
        shorties.setFlying(false);
        System.out.println(shorties.getName() + " приземлился");
    }
}
