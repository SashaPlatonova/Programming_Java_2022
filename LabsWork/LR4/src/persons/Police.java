package persons;

import exception.NoWeaponTypeException;
import interfaces.Aggressive;
import interfaces.Awakable;
import stuff.ShortiesType;
import stuff.WeaponType;

public class Police extends Shorties implements Awakable {
    private WeaponType type;

    public Police(String name, WeaponType type) {
        super(ShortiesType.MOON, name, null);
        this.type = type;
    }

    private class Weapon implements Aggressive{

        @Override
        public void attack() {
            if (type == null) {
                throw new NoWeaponTypeException("The weapon should have a type");
            }
            System.out.println(name + " attack shorties by " + type.getName());
        }

    }

    @Override
    public void doSmth() {
        Weapon weapon = this. new Weapon();
        weapon.attack();
    }

    public WeaponType getType() {
        if (type == null) {
            throw new NoWeaponTypeException("The weapon should have a type");
        }
        return type;
    }
}
