package Model.units;

import Model.units.Enums.ArmorType;
import Model.units.Enums.WeaponType;

public abstract class Troops extends People{
    protected WeaponType weaponType;
    protected ArmorType armorType;
    protected int damage;
    protected boolean hasHorse;
    protected boolean isArab;
    protected boolean hasFiringWeapon;

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isHasHorse() {
        return hasHorse;
    }

    public boolean isArab() {
        return isArab;
    }

    public boolean isHasFiringWeapon() {
        return hasFiringWeapon;
    }
}
